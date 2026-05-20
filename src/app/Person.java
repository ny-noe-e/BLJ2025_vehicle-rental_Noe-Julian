package app;

import java.time.LocalDate;

public class Person {
    LocalDate birthYear;
    String name;
    String firstName;
    String adress;

    public Person(LocalDate birthYear, String name, String firstName, String adress) {
        this.birthYear = birthYear;
        this.name = name;
        this.firstName = firstName;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return firstName + " " + name + ", " + birthYear + ", " + adress;
    }

}
