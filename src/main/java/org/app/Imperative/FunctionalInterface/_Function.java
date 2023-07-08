package org.app.Imperative.FunctionalInterface;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println("IMPERATIVE");
      int increment=  increment(1);
        System.out.println(increment);
        System.out.println("-".repeat(30));


        //Function examples
        System.out.println("DECLARATIVE");
        int increment2 = incrementByOne.apply(1);
        System.out.println(increment2);
        System.out.println("-".repeat(30));

        //CHAINING FUNCTIONS
        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);
        System.out.println("-".repeat(30));

        Function<Integer,Integer> addBy1andThenMultiplyBy10 = incrementByOne.andThen(multiplyBy10);
        System.out.println(addBy1andThenMultiplyBy10.apply(4));
        System.out.println("-".repeat(30));

       //Bifunctions
        //imperative
        System.out.println(incrementByOneAndMultiply(4,100));

        //declarative
        System.out.println(incrementByOneAndMultiplyBiFxn.apply(4,100));


    }




    //imperative

    static int increment(int number){
        return number +1;

    }

    static int incrementByOneAndMultiply(int number,int numToMultiplyBy){
        return (number +1) * numToMultiplyBy;

    }

    //declarative
    //Fxns take one argument and returns one result
    static Function<Integer, Integer> incrementByOne = number -> number +1;
    static Function<Integer, Integer> multiplyBy10 =number -> number*10;

    //BiFunctions take two arguments and returns one result
     static BiFunction<Integer, Integer,Integer> incrementByOneAndMultiplyBiFxn =
            (numberToIncrementByOne, numberToMultiplyBy) ->
            (numberToIncrementByOne + 1) * numberToMultiplyBy;

}
