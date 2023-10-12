package repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataSource.DBDatasourceFactory;
import dataSource.IDBDataSource;
import domain.Aircraft;
import repository.api.IAircraftRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AircraftRepo implements IAircraftRepo {

    IDBDataSource source = DBDatasourceFactory.getInstance();

    public AircraftRepo() {
    }

    @Override
    public List<Aircraft> getAircraftsList() {
        List<Aircraft> aircraftLists=new ArrayList<>();
        ObjectMapper objectMapper=new ObjectMapper();
        TypeReference<HashMap<String,String>> typeRef
                = new TypeReference<HashMap<String,String>>() {};
        try(Connection connection = source.getConnection();
            Statement stmt = connection.createStatement();) {
            ResultSet rst = stmt.executeQuery("SELECT aircraft_code,model,range FROM bookings.aircrafts_data");
            while (rst.next()) {
                Aircraft aircraft=new Aircraft(rst.getString(1),objectMapper.readValue(rst.getString(2), typeRef),rst.getInt(3));
                aircraftLists.add(aircraft);
            }
        } catch (SQLException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return aircraftLists;
    }
}
