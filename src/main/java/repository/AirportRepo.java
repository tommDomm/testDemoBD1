package repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataSource.DBDatasourceFactory;
import dataSource.IDBDataSource;
import domain.Airport;
import repository.api.IAirportRepo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AirportRepo implements IAirportRepo {

    IDBDataSource source = DBDatasourceFactory.getInstance();

    @Override
    public List<Airport> getAirports() {
        List<Airport> airportLists = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<HashMap<String, String>> typeRef
                = new TypeReference<HashMap<String, String>>() {
        };
        try (Connection connection = source.getConnection();
            Statement stmt = connection.createStatement();) {
            ResultSet rst = stmt.executeQuery("SELECT airport_code, airport_name, city, coordinates, timezone FROM bookings.airports_data");
            while (rst.next()) {
                Airport airport = new Airport(rst.getString(1), objectMapper.readValue(rst.getString(2), typeRef), objectMapper.readValue(rst.getString(3), typeRef), rst.getString(4), rst.getString(5));
                airportLists.add(airport);
            }
        } catch (SQLException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return airportLists;
    }
}
