import dataSource.DBDataSource;
import org.junit.Test;
import repository.AircraftRepo;
import repository.FlightRepo;
import repository.api.IAircraftRepo;
import repository.api.IFlightRepo;

import java.io.IOException;
import java.net.URISyntaxException;

public class TestConnection {

    IAircraftRepo repo = new AircraftRepo();
    IFlightRepo frepo = new FlightRepo();

    @Test
    public void doTest() {
//        repo.getAircraftsList().forEach(System.out::println);

//        frepo.getFlightList(10).forEach(System.out::println);
    }
}
