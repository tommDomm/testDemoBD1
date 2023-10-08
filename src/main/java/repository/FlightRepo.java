package repository;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import dataSource.DBDatasourceFactory;
import dataSource.IDBDataSource;
import domain.Flight;
import org.joda.time.format.DateTimeFormatter;
import repository.api.IFlightRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightRepo implements IFlightRepo {

    IDBDataSource source = DBDatasourceFactory.getInstance();

    @Override
    public List<Flight> getFlightList(int offset) {
        List<Flight> flightList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ssZZ");
        try (Connection connection = source.getConnection();) {
            PreparedStatement pstmt = connection.prepareStatement("select  flight_no, scheduled_departure, scheduled_arrival, departure_airport, arrival_airport, status, aircraft_code from flights limit 30 offset (?)");
            pstmt.setInt(1, offset);
            ResultSet rst = pstmt.executeQuery();
            while (rst.next()) {
                Flight flight = new Flight(rst.getString(1), DateTime.parse(rst.getString(2) + ":00", formatter).toDate(), DateTime.parse(rst.getString(3) + ":00", formatter).toDate(), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(6));
                flightList.add(flight);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flightList;

    }
}
