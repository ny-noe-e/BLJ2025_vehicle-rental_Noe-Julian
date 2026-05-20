package app.vehicles;
import app.Vehicle;

public class Truck extends Vehicle {
    double loadVolume;

    public Truck(String licensePlate, String brand, String model, double pricePerDay, double loadVolume) {
        super(licensePlate, brand, model, pricePerDay);
        this.loadVolume = loadVolume;
    }
}
