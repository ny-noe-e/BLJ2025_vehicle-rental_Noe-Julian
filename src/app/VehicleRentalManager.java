package app;
import exceptions.PersonInDenyListException;

import java.util.List;
import java.util.NoSuchElementException;

public class VehicleRentalManager {
    private List<Vehicle> vehicles;
    private List<Contract> contracts;
    private List<Person> customerList;
    private List<Person> denyList;

    public void addPersonToDenyList(Person person){
        if (person == null || person.equals(null))throw new NoSuchElementException("No person defined in parameter");
        else if(isInDenyList(person)) throw new PersonInDenyListException("Person is already in deny list");
        else denyList.add(person);
    }
    public boolean isInDenyList(Person person){
        if (person == null || person.equals(null))throw new NoSuchElementException("No person defined in parameter");
        for (Person findPerson : denyList){
            if (findPerson.equals(person)) return true;
        }
        return false;
    }
}
