package app;

import exceptions.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static app.VehicleRentalManager.objectIsExistingInList;
import static java.lang.Integer.parseInt;

public class Contract {
    Person customer;
    Vehicle vehicle;
    LocalDate startDate;
    LocalDate endDate;
    String condition;

    public Contract(Person customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate,
                    String condition, List<Person> denyList) {

        LocalDate today = LocalDate.now();
        Period age = Period.between(customer.birthYear, today);
        int yearsOld = age.getYears();

        if (yearsOld < 18) throw new MinorAgeException("Customer is too young");
        if (objectIsExistingInList(customer, denyList)) throw new DenylistedPersonException("Customer is in deny list");
        for (RentTime rents : vehicle.rentDates) {
            if (!startDate.isAfter(rents.endRent) && !endDate.isBefore(rents.startRent))
                throw new LeaseLengthCollisionException
                        ("Vehicle is rented in this time: " + rents.startRent + "-" + rents.endRent);
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date. Minimum rental period is 1 day.");
        }
        
        RentTime rt = new RentTime(startDate, endDate);
        vehicle.rentDates.add(rt);
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.condition = condition;
    }

    public StringBuilder WriteToFile(Contract contract) {
        String separationLine = "------------------------------------------------------";
        long rentPeriod = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        double total = rentPeriod * contract.vehicle.getPricePerDay();
        StringBuilder contractFile = new StringBuilder();
        contractFile.append(contract.customer.getName() + contract.customer.getFirstName() + "\n" + contract.customer.getAddress() + "\n");
        contractFile.append("\n Noser Garage \n Address \n " + separationLine);
        contractFile.append("\n Vehicle: " + contract.vehicle.getBrand() + " " + vehicle.getModel());
        contractFile.append("\n Price per day: " + contract.vehicle.getPricePerDay());
        contractFile.append("\n\n Start of rent: " + contract.startDate + "\n" + "End of rent: " + contract.endDate);
        contractFile.append("\n Total amount of days: " + rentPeriod);
        contractFile.append("\n Total price: " + total + "\n" + separationLine + "\n");
        contractFile.append(" Condition: " + contract.condition);
        return contractFile;
    }
}
