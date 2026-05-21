package app;

import exceptions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalManager {
    private List<Vehicle> vehicles;
    private List<Contract> contracts;
    private List<Person> customerList;
    private List<Person> denyList;

    public VehicleRentalManager(List<Vehicle> vehicles, List<Contract> contracts,
                                List<Person> customerList, List<Person> denyList){
        this.vehicles = vehicles;
        this.contracts = contracts;
        this.customerList = customerList;
        this.denyList = denyList;
    }

    public VehicleRentalManager() {
        this.vehicles = new ArrayList<>();
        this.contracts = new ArrayList<>();
        this.customerList = new ArrayList<>();
        this.denyList = new ArrayList<>();
    }

    public void addPersonToDenyList(Person person) {
        if (objectIsExistingInList(person, denyList)) throw new ObjectAlreadyInListException("Person is already in deny list");
        else denyList.add(person);
    }

    public Contract createContract(Person customer,
                               Vehicle vehicle,
                               LocalDate startDate,
                               LocalDate endDate,
                               String condition) {
        if (customer == null) throw new NullPointerException("No person defined in parameter");
        if (vehicle == null) throw new NullPointerException("No vehicle defined in parameter");
        if (startDate == null) throw new NullPointerException("No start-date defined in parameter");
        if (endDate == null) throw new NullPointerException("No end-date defined in parameter");
        if (condition == null) condition = "No condition defined";
        Contract contract = new Contract(customer, vehicle, startDate, endDate, condition, denyList);
        contracts.add(contract);
        return contract;
    }

    public void addVehicle(Vehicle vehicle){
        if (vehicle == null) throw new NullPointerException ("No vehicle defined in parameter");
        if (objectIsExistingInList(vehicle, vehicles)) throw new
                    ObjectAlreadyInListException("License plate already registered");
        vehicles.add(vehicle);
        availableVehicles.add(vehicle);
    }
    public void returnVehicle(Vehicle vehicle){
        //not implemented yet
    }

    public void addCustomer(Person customer){
        if (objectIsExistingInList(customer, customerList))
            throw new ObjectAlreadyInListException("Customer already registered");
       customerList.add(customer);
    }

    public List<Vehicle> getAvailableVehicles(){
        if (availableVehicles == null) throw new NullPointerException("No Vehicles available");
        return availableVehicles;
    }

    public static boolean objectIsExistingInList(Object o, List<?> list){
        if (o == null ) throw new NullPointerException("The passed parameter object is null");
        for (Object findObject: list) {
            if (findObject.equals(o)) return true;
        }
        return false;
    }
}
