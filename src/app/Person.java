package app;

import java.time.LocalDate;

public class Person {
    LocalDate birthYear;
    String name;
    String firstName;
    String address;

    public Person(LocalDate birthYear, String name, String firstName, String address) {
        this.birthYear = birthYear;
        this.name = name;
        this.firstName = firstName;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + name + ", " + birthYear + ", " + address;
    }

}
