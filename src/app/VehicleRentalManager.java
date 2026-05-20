package app;

import exceptions.PersonInDenyListException;
import java.time.LocalDate;
import java.util.List;

public class VehicleRentalManager {
    private List<Vehicle> vehicles;
    private List<Contract> contracts;
    private List<Person> customerList;
    private List<Person> denyList;

    public void addPersonToDenyList(Person person) {
        if (person == null ) throw new NullPointerException("No person defined in parameter");
        else if (isInDenyList(person)) throw new PersonInDenyListException("Person is already in deny list");
        else denyList.add(person);
    }

    public boolean isInDenyList(Person person) {
        if (person == null ) throw new NullPointerException("No person defined in parameter");
        for (Person findPerson : denyList) {
            if (findPerson.equals(person)) return true;
        }
        return false;
    }

    public Contract createContract(Person customer,
                               Vehicle vehicle,
                               LocalDate startDate,
                               LocalDate endDate,
                               String condition) {
        if (customer == null)throw new NullPointerException("No person defined in parameter");
        if (vehicle == null)throw new NullPointerException("No vehicle defined in parameter");
        if (startDate == null) throw new NullPointerException("No start-date defined in parameter");
        if (endDate == null ) throw new NullPointerException("No end-date defined in parameter");
        if (condition == null) condition = "No condition defined";
        return contracts.add(new Contract(customer, vehicle, startDate, endDate, condition));
    }

    public Vehicle addVehicle(Vehicle vehicle){

    }
}
