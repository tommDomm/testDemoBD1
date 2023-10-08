package services;

import domain.Aircraft;
import repository.api.IAircraftRepo;
import repository.factory.AircraftFactory;
import repository.factory.AirportFactory;

import java.util.List;

public class AircraftService {
    IAircraftRepo repo= AircraftFactory.getInstance();

    public AircraftService() {

    }

    public List<Aircraft> getAircraftLists() {
        return repo.getAircraftsList();
    }

}
