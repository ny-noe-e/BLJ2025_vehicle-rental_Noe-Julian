package app;

import app.vehicles.Camper;
import app.vehicles.Car;
import app.vehicles.Trailer;
import app.vehicles.Truck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    String designLine = "----------------------------------------------------------------------------";

    protected void PersonCreate() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(LocalDate.of(1995, 4, 12), "Muster", "Max", "Bahnhofstrasse 1"));
        persons.add(new Person(LocalDate.of(2001, 6, 4), "Mueller", "Marcel", "Geerenstrasse 14"));
        persons.add(new Person(LocalDate.of(1998, 2, 18), "Keller", "Sofia", "Limmatstrasse 22"));
        persons.add(new Person(LocalDate.of(1989, 11, 30), "Schneider", "Lukas", "Alpenweg 7"));
        persons.add(new Person(LocalDate.of(2004, 8, 9), "Fischer", "Noah", "Seeufer 15"));
        persons.add(new Person(LocalDate.of(1992, 1, 25), "Wagner", "Emma", "Bergstrasse 4"));
        persons.add(new Person(LocalDate.of(2000, 12, 3), "Huber", "Leon", "Zentralplatz 9"));

        System.out.println("Customers");
        System.out.println(designLine);
        System.out.printf("%-18s %-18s %-12s %-24s%n", "First Name", "Surname", "Birthdate", "Address");
        System.out.println(designLine);

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println(designLine);
    }

    protected void VehicleCreate() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Camper("ZH 7362049", "Hypermobil", "Hypermobil", 130.0, 3.5));
        vehicles.add(new Camper("ZH 5296841", "VW", "California", 140, 2.0));

        vehicles.add(new Car("ZH 1847306", "Opel", "Corsa", 50, false));
        vehicles.add(new Car("ZH 8614752", "Fiat", "500", 50, false));
        vehicles.add(new Car("ZH 3049186", "Hyundai", "I10", 50, false));
        vehicles.add(new Car("ZH 3049187", "Suzuki", "Swift", 50, false));

        vehicles.add(new Car("ZH 6049188", "Mercedes", "S-Class", 300, true));
        vehicles.add(new Car("ZH 3544189", "BMW", "Z4", 220, true));
        vehicles.add(new Car("ZH 7043190", "Mazda", "MX-5", 160, true));
        vehicles.add(new Car("ZH 3249191", "BMW", "I8", 600, true));

        vehicles.add(new Truck("ZH 1048192", "Mercedes", "Vito", 150, 1200));
        vehicles.add(new Truck("ZH 8049193", "VW", "Crafter", 220, 1700));
        vehicles.add(new Truck("ZH 3045194", "Iveco", "daily", 240, 4000));
        vehicles.add(new Truck("ZH 2849195", "Opel", "Cicoro E", 140, 700));
        vehicles.add(new Truck("ZH 4648196", "VW", "e-Crafter", 220, 1600));

        vehicles.add(new Trailer("ZH 9440197", "Boeckmann", "Hochlader", 120, 2600, 1350));
        vehicles.add(new Trailer("ZH 3945198", "Boeckmann", "Bootsanhaenger", 180, 3400, 2400));
        vehicles.add(new Trailer("ZH 4249399", "Boeckmann", "Tieflader", 80, 1400, 800));

        System.out.println("Vehicles");
        System.out.println(designLine);
        System.out.printf("%-18s %-18s %-12s %8s%n", "Brand", "Model", "PlateNr", "Price");
        System.out.println(designLine);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println(designLine);
    }
}
