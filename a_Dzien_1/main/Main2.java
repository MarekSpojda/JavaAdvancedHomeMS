package a_Dzien_1.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Nowak"));
        people.add(new Person("Andrzej", "Nijaki"));
        people.add(new Person("Stefan", "Żeromski"));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
