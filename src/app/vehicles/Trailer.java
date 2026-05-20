package app.vehicles;
import app.Vehicle;

public class Trailer extends Vehicle{
    double loadVolume;

    public Trailer(String licensePlate, String brand, String model, double pricePerDay, double loadVolume) {
        super(licensePlate, brand, model, pricePerDay);
        this.loadVolume = loadVolume;
    }
}
