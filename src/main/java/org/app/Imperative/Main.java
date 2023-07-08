/*
package org.app.Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import static org.app.Imperative.Main.Gender.FEMALE;
import static org.app.Imperative.Main.Gender.MALE;

public class Main{
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        System.out.println("IMPERATIVE APPROACH");
        //IMPERATIVE APPROACH
        List<Person> females = new ArrayList<>();

       for(Person person: people){
          if(FEMALE.equals(person.gender)){
               females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);

        }
        System.out.println("DECLARATIVE APPROACH");
        //DECLARATIVE APPROACH
        //Predicate is a statement about sthg that is either true or false
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE
    }


}*/
