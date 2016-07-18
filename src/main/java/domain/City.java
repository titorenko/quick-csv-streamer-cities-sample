package domain;

import uk.elementarysoftware.quickcsv.api.CSVRecordWithHeader;

public class City {
    
    public static enum CSVFields {
        AccentCity,
        Population,
        Latitude,
        Longitude
    }
    
    private final String city;
    private final int population;
    private final double latitude;
    private final double longitude;

    public City(CSVRecordWithHeader<CSVFields> r) {
        this.city = r.getField(CSVFields.AccentCity).asString();
        this.population = r.getField(CSVFields.Population).asInt();
        this.latitude = r.getField(CSVFields.Latitude).asDouble();
        this.longitude = r.getField(CSVFields.Longitude).asDouble();
    }

    public String getCity() {
        return city;
    }

    public int getPopulation() {
        return population;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "City [city=" + city + ", population=" + population + ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }
}