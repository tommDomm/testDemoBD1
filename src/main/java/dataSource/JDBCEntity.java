package dataSource;

public class JDBCEntity {
    String url;
    String username;
    String password;

    String driverClassName;

    String platform;

    public JDBCEntity() {
    }

    public JDBCEntity(String url, String name, String pass, String dbname, String platform) {
        this.url = url;
        this.username = name;
        this.password = pass;
        this.driverClassName = dbname;
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
