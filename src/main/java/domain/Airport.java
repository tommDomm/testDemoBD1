package domain;

import java.util.Map;
import java.util.Objects;

public class Airport {

    String airportCode;
    Map<String, String> airportName;
    Map<String, String> city;
    String coordinate;
    String timeZone;

    public Airport() {
    }

    public Airport(String airportCode, Map<String, String> airportName, Map<String, String> city, String coordinate, String timeZone) {
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.city = city;
        this.coordinate = coordinate;
        this.timeZone = timeZone;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }


    public Map<String, String> getAirportName() {
        return airportName;
    }

    public void setAirportName(Map<String, String> airportName) {
        this.airportName = airportName;
    }

    public Map<String, String> getCity() {
        return city;
    }

    public void setCity(Map<String, String> city) {
        this.city = city;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    @Override
    public String toString() {
        return "{" +
                "\"airportCode\":\"" + airportCode + "\"" +
                ", \"airportName\":" + airportName +
                ", \"city\":" + city +
                ", \"coordinate\":\"" + coordinate + "\"" +
                ", \"timeZone\":\"" + timeZone + "\"" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!Objects.equals(airportCode, airport.airportCode)) return false;
        if (!Objects.equals(airportName, airport.airportName)) return false;
        if (!Objects.equals(city, airport.city)) return false;
        if (!Objects.equals(coordinate, airport.coordinate)) return false;
        return Objects.equals(timeZone, airport.timeZone);
    }

    @Override
    public int hashCode() {
        int result = airportCode != null ? airportCode.hashCode() : 0;
        result = 31 * result + (airportName != null ? airportName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (coordinate != null ? coordinate.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        return result;
    }
}
