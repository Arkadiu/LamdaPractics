package com.arkadiu.test.predicates;

import com.arkadiu.test.predicates.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 17.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Ваня", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 19));

        persons.stream().forEach(o -> System.out.println(o));

        System.out.println("===Совершенолетние===");

        persons.stream()
                .filter(p -> p.getAge() >= 18)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .map(p -> p.getName())
                .forEach(System.out::println);
        double averageAge = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println("Средний возраст: " + averageAge);
    }
}
