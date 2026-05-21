package app;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    String licensePlate;
    String brand;
    String model;
    double pricePerDay;
    List<RentTime> rentDates;
    public Vehicle(String licensePlate, String brand, String model, double pricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.rentDates = new ArrayList<RentTime>();
    }

    @Override
    public String toString(){
        return brand + " " + model + " " + licensePlate + " " + pricePerDay;
    }
}
