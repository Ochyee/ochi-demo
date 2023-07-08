package FinalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lamdas {
    public static void main(String[] args) {
        //WITH ONE ARGUMENT
        Function<String, String> upperCaseName = name -> name.toUpperCase(); //METHOD1
        Function<String, String> upperCaseName2 = String::toUpperCase; //METHOD2

        //WITH TWO ARGUMENTS
        BiFunction<String, Integer, String> upperCaseName3 = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException(" ");
            System.out.println(age);
            return name.toUpperCase();
        };

        String uperCasedName = upperCaseName3.apply("Alex", 20);
        System.out.println(uperCasedName); 

    }
}
