package parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

import uk.elementarysoftware.quickcsv.api.CSVParserBuilder;
import uk.elementarysoftware.quickcsv.api.CSVRecord;
import domain.City;

public class Parser {

    public static void main(String[] args) throws IOException {
        InputStream source = Parser.class.getResourceAsStream("/cities.txt");
        Stream<CSVRecord> records = CSVParserBuilder.aParser().forRfc4180().skipFirstRecord().build().parse(source);
        Stream<City> cities = records.map(r -> new City(r));
        cities.forEach(c -> System.out.println(c));
    }
}