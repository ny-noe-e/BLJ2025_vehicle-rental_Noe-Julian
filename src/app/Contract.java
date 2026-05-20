package app;

import java.time.LocalDate;

public class Contract{
    Person customer;
    Vehicle vehicle;
    LocalDate startDate;
    LocalDate endDate;
    String condition;

    public Contract(Person customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, String condition) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.condition = condition;
    }

    public void WrteToFile(){
        
    }
}
