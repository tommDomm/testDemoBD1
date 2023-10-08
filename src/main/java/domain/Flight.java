package domain;

import java.util.Date;

public class Flight {
    long id;
    String flightNumber;
    Date scheduledDeparture;
    Date scheduledArrival;
    String departureAirport;
    String arrivalAirport;
    String status;
    String aircraftCode;
    Date actualDeparture;
    Date actualArrival;

    public Flight(String flightNumber, Date scheduledDeparture, Date scheduledArrival, String departureAirport, String arrivalAirport, String status, String aircraftCode, Date actualDeparture, Date actualArrival) {
        this.flightNumber = flightNumber;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledArrival = scheduledArrival;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.status = status;
        this.aircraftCode = aircraftCode;
        this.actualDeparture = actualDeparture;
        this.actualArrival = actualArrival;
    }

    public Flight( String flightNumber, Date scheduledDeparture, Date scheduledArrival, String departureAirport, String arrivalAirport, String status, String aircraftCode) {
        this.flightNumber = flightNumber;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledArrival = scheduledArrival;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.status = status;
        this.aircraftCode = aircraftCode;
    }

    public Flight() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(Date scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public Date getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(Date scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public Date getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(Date actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public Date getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(Date actualArrival) {
        this.actualArrival = actualArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!scheduledDeparture.equals(flight.scheduledDeparture)) return false;
        if (!scheduledArrival.equals(flight.scheduledArrival)) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        if (!status.equals(flight.status)) return false;
        return aircraftCode.equals(flight.aircraftCode);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + scheduledDeparture.hashCode();
        result = 31 * result + scheduledArrival.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + aircraftCode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "{\"flightNumber\":\"" + flightNumber + "\"" +
                ", \"scheduledDeparture\":\"" + scheduledDeparture + "\"" +
                ", \"scheduledArrival\":\"" + scheduledArrival+ "\"" +
                ", \"departureAirport\":\"" + departureAirport + "\"" +
                ", \"arrivalAirport\":\"" + arrivalAirport + "\"" +
                ", \"status\":\"" + status + "\"" +
                ", \"aircraftCode\":\"" + aircraftCode+ "\"" +
                ", \"actualDeparture\":\"" + actualDeparture + "\"" +
                ", \"actualArrival\":\"" + actualArrival + "\"" +
                "}";
    }
}
