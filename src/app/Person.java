package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    LocalDate birthYear;
    String name;
    String firstName;
    String address;
    int iD;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Person(int iD, LocalDate birthYear, String name, String firstName, String address) {
        this.iD = iD;
        this.birthYear = birthYear;
        this.name = name;
        this.firstName = firstName;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "%-5s %-18s %-18s %-12s %-24s",
                iD,
                firstName,
                name,
                birthYear.format(DATE_FORMAT),
                address
        );
    }





}
