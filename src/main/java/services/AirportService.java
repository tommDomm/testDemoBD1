package services;

import domain.Airport;
import repository.AirportRepo;
import repository.api.IAirportRepo;
import repository.factory.AirportFactory;

import java.util.List;

public class AirportService {
    IAirportRepo airportRepo = AirportFactory.getInstance();

    public AirportService() {
    }

    public List<Airport> getAirports(){
        return airportRepo.getAirports();
    }
}
