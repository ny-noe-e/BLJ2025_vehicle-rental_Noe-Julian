package app.vehicles;
import app.Vehicle;

public class Car extends Vehicle {
    boolean isLuxuryCar;

    public Car(String licensePlate, String brand, String model, double pricePerDay, boolean isLuxuryCar) {
        super(licensePlate, brand, model, pricePerDay);
        this.isLuxuryCar = isLuxuryCar;
    }
}
