package app.vehicles;
import app.Vehicle;

public class Trailer extends Vehicle{
    double loadVolume;
    double weight;

    public Trailer(String licensePlate, String brand, String model, double pricePerDay, double loadVolume, double weight) {
        super(licensePlate, brand, model, pricePerDay);
        this.loadVolume = loadVolume;
        this.weight = weight;
    }
}
