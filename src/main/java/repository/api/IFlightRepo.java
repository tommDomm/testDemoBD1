package repository.api;

import domain.Flight;

import java.util.List;

public interface IFlightRepo {
    List<Flight> getFlightList(int offset);
}
