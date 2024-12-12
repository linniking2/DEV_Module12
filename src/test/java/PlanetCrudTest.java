import org.dev.module12.Planet;
import org.dev.module12.PlanetCrudService;

import java.util.List;

public class PlanetCrudTest {
    public static void main(String[] args) {
        PlanetCrudService planetService = new PlanetCrudService();


        Planet mars = new Planet("MARS", "Mars");
        planetService.create(mars);


        Planet readPlanet = planetService.read("MARS");
        System.out.println("Read Planet: " + readPlanet);


        readPlanet.setName("Red Planet");
        planetService.update(readPlanet);


        List<Planet> planets = planetService.readAll();
        System.out.println("All Planets: " + planets);


        planetService.delete("MARS");
    }
}
