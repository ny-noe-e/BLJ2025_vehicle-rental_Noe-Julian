package app.vehicles;

import app.Vehicle;

public class Camper extends Vehicle {
    double weight;

    public Camper(String licensePlate, String brand, String model, double pricePerDay, double weight) {
        super(licensePlate, brand, model, pricePerDay);
        this.weight = weight;
    }
}
