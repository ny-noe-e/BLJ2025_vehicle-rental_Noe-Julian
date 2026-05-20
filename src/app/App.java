package app;

import app.vehicles.Camper;
import app.vehicles.Car;
import app.vehicles.Trailer;
import app.vehicles.Truck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    String designline = "----------------------------------------------";

    public void PersonCreate(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(LocalDate.of(1995, 4, 12), "Muster", "Max", "Bahnhofstrasse 1"));
        persons.add(new Person(LocalDate.of(2001, 6, 4), "Mueller", "Marcel", "Geerenstrasse 14"));

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(designline);
    }

    public void VehicleCreate(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Camper("ZH 7362049", "Hypermobil", "Hypermobil", 130.0, 3.5));
        vehicles.add(new Camper("ZH 5296841", "VW", "California", 140, 2.0));
        vehicles.add(new Car("ZH 1847306", "Opel", "Corsa", 50, false));
        vehicles.add(new Car("", "Fiat", "", 50, false));
        vehicles.add(new Car("", "Hyundai", "", 50, false));
        vehicles.add(new Car("", "Suzuki", "", 50, false));
        vehicles.add(new Car("", "Mercedes", "S-Class", 300, true));
        vehicles.add(new Car("", "BMW", "Z4 ", 220, true));
        vehicles.add(new Car("", "Mazda", "MX-5", 160, true));
        vehicles.add(new Car("", "BMW", "I8", 600, true));
        vehicles.add(new Truck("", "Mercedes", "Vito", 150, 1200));
        vehicles.add(new Truck("", "VW", "Crafter", 220, 1700));
        vehicles.add(new Truck("", "Iveco", "daily", 240, 4000));
        vehicles.add(new Truck("", "Opel", "Cicoro E",  140, 700));
        vehicles.add(new Truck("", "VW", "e-Crafter", 220, 1600));
        vehicles.add(new Trailer("", "Böckmann", "Hochlader", 120, 2600));
        vehicles.add(new Trailer("", "Böckmann", "Bootsanhänger", 180, 3400));
        vehicles.add(new Trailer("", "Böckmann", "Tieflader", 80, 1400));

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        System.out.println(designline);
    }
}
