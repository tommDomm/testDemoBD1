package repository.factory;

import repository.AircraftRepo;
import repository.api.IAircraftRepo;

public class AircraftFactory {

    private volatile static IAircraftRepo instance;
    private AircraftFactory() {
    }

    public static IAircraftRepo getInstance() {

        if (instance == null) {
            synchronized (AircraftFactory.class) {
                if (instance == null) {
                    instance = new AircraftRepo();
                }
            }
        }
        return instance;
    }
}
