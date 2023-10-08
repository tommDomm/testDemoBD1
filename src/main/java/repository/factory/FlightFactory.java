package repository.factory;

import repository.AirportRepo;
import repository.FlightRepo;
import repository.api.IAirportRepo;
import repository.api.IFlightRepo;

public class FlightFactory {

    private volatile static IFlightRepo instance;
    private FlightFactory() {
    }

    public static IFlightRepo getInstance() {

        if (instance == null) {
            synchronized (FlightFactory.class) {
                if (instance == null) {
                    instance = new FlightRepo();
                }
            }
        }
        return instance;
    }
}
