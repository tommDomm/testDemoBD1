package domain;

import java.util.Map;

public class Aircraft {
    String aircraftCode;
    Map<String,String> model;
    int range;

    public Aircraft(String aircraftCode, Map<String,String> model, int range) {
        this.aircraftCode = aircraftCode;
        this.model = model;
        this.range = range;
    }

    public Aircraft() {
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }



    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Map<String, String> getModel() {
        return model;
    }

    public void setModel(Map<String, String> model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aircraft aircraft = (Aircraft) o;

        if (range != aircraft.range) return false;
        if (!aircraftCode.equals(aircraft.aircraftCode)) return false;
        return model.equals(aircraft.model);
    }

    @Override
    public int hashCode() {
        int result = aircraftCode.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + range;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "\"aircraftCode\":\"" + aircraftCode + '\"' +
                ",\"model\":" + model +
                ", \"range\":\"" + range +
                "\"}";
    }
}
