package dataSource;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDBDataSource {

    Connection getConnection() throws SQLException;

}
