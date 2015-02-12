package domain;

import uk.elementarysoftware.quickcsv.api.CSVRecord;

public class City {
    private static final int CITY_FIELD_INDEX = 2;
    
    private final String city;
    private final int population;
    private final double latitude;
    private final double longitude;

    public City(CSVRecord r) {
        r.skipFields(CITY_FIELD_INDEX);
        this.city = r.getNextField().asString();
        r.skipField();
        this.population = r.getNextField().asInt();
        this.latitude = r.getNextField().asDouble();
        this.longitude = r.getNextField().asDouble();
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