package services;

import domain.Flight;
import repository.FlightRepo;
import repository.api.IFlightRepo;
import repository.factory.FlightFactory;

import java.util.List;

public class FlightsService {

    IFlightRepo flightRepo = FlightFactory.getInstance();

    public FlightsService() {

    }

    public List<Flight> getFlights(int offset) {
        return flightRepo.getFlightList(offset);
    }
}
