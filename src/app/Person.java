package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    LocalDate birthYear;
    String name;
    String firstName;
    String adress;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Person(LocalDate birthYear, String name, String firstName, String adress) {
        this.birthYear = birthYear;
        this.name = name;
        this.firstName = firstName;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format(
                "%-18s %-18s %-12s %-24s",
                firstName,
                name,
                birthYear.format(DATE_FORMAT),
                adress
        );
    }

}
