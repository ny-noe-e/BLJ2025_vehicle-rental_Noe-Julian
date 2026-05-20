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
    public String toString(){
        return brand + " " + model + " " + licensePlate + " " + pricePerDay;
    }
}
