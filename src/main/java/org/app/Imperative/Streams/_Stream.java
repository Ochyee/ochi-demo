package org.app.Imperative.Streams;

import java.util.List;
import java.util.stream.Collectors;

import static org.app.Imperative.Streams._Stream.Person.Gender.FEMALE;
import static org.app.Imperative.Streams._Stream.Person.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
      //people.stream() //enables fxnal style ops on streams
                //.map(person-> person.gender) //transform everything in the list to gender
               // .map(person -> person.name)
              //  .mapToInt(String::length)
               // .collect(Collectors.toSet())  //removes duplicates
              //  .forEach(System.out::println);


        //Predicate<Person> personPredicate = person-> FEMALE.equals(person.gender);
        //boolean containsOnlyFemales = people.stream();
        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println( containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
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
        enum Gender{
            MALE,FEMALE
        }


    }
}
