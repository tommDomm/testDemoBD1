package dataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.postgresql.ds.PGConnectionPoolDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

public class DBDataSource implements IDBDataSource {
    private final PGConnectionPoolDataSource source = new PGConnectionPoolDataSource();

    public DBDataSource() {
        try {
            init();
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    private void init() throws IOException, URISyntaxException {
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        om.findAndRegisterModules();
        JDBCEntity entity = om.readValue(new File("C:\\Program Files\\Tomcat\\apache-tomcat-10.1.13\\webapps\\booking\\WEB-INF\\classes/application.yml"), JDBCEntity.class);
        URI uri = new URI(entity.getUrl());
        source.setServerNames(new String[]{
                uri.getHost()
        });
        source.setDatabaseName(uri.getPath().substring(1));
        source.setUser(entity.getUsername());
        source.setPassword(entity.getPassword());
//        source.setPortNumbers(uri.getPort());
    }

    @Override
    public Connection getConnection() throws SQLException {
        return source.getConnection();
    }
}
