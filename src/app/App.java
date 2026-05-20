package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public void PersonRun(){
        Personcreate();

    }

    public void Personcreate(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(LocalDate.of(1995, 4, 12), "Muster", "Max", "Bahnhofstrasse 1"));
        persons.add(new Person(LocalDate.of(2001, 6, 4), "Mueller", "Marcel", "Geerenstrasse 14"));

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
