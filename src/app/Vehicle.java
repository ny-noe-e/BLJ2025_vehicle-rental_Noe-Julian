package app;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected double pricePerDay;
    protected List<RentTime> rentDates;
    public Vehicle(String licensePlate, String brand, String model, double pricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.rentDates = new ArrayList<RentTime>();
    }

    @Override
    public String toString() {
        return String.format(
                "%-18s %-18s %-12s %8.2f",
                brand,
                model,
                licensePlate,
                pricePerDay
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle v) {
            return this.licensePlate.equals(v.licensePlate);
        }
        return false;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
