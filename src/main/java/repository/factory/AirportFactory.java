package repository.factory;

import repository.AircraftRepo;
import repository.AirportRepo;
import repository.api.IAircraftRepo;
import repository.api.IAirportRepo;

public class AirportFactory {

    private volatile static IAirportRepo instance;
    private AirportFactory() {
    }

    public static IAirportRepo getInstance() {

        if (instance == null) {
            synchronized (AirportFactory.class) {
                if (instance == null) {
                    instance = new AirportRepo();
                }
            }
        }
        return instance;
    }
}
