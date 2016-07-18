package parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

import domain.City;
import uk.elementarysoftware.quickcsv.api.CSVParser;
import uk.elementarysoftware.quickcsv.api.CSVParserBuilder;

public class Parser {

    public static void main(String[] args) throws IOException {
        InputStream source = Parser.class.getResourceAsStream("/cities.txt");
        CSVParser<City> parser = CSVParserBuilder.aParser(City::new, City.CSVFields.class).forRfc4180().build();
        Stream<City> cities = parser.parse(source);
        cities.forEach(System.out::println);
    }
}