package app;

public class Vehicle {
    String licensePlate;
    String brand;
    String model;
    double pricePerDay;

    public Vehicle(String licensePlate, String brand, String model, double pricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
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
}
