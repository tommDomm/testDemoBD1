package dataSource;

import repository.AircraftRepo;
import repository.api.IAircraftRepo;
import repository.factory.AircraftFactory;

public class DBDatasourceFactory {
    private volatile static IDBDataSource instance;

    private DBDatasourceFactory() {
    }

    public static IDBDataSource getInstance() {

        if (instance == null) {
            synchronized (DBDatasourceFactory.class) {
                if (instance == null) {
                    instance = new DBDataSource();
                }
            }
        }
        return instance;
    }

}
