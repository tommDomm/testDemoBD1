package repository.api;

import domain.Aircraft;

import java.util.List;

public interface IAircraftRepo {
    List<Aircraft> getAircraftsList();
}
