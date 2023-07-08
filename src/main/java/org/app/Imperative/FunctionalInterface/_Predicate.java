package org.app.Imperative.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //USING NORMAL FUNCTION
        System.out.println("WITHOUT PREDICATE");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));

        //USING PREDICATE
        System.out.println("WITH PREDICATE");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        //CHAINING PREDICATES(or can be used in place of and & returns true if one of the condition is met
        System.out.println("Is phone number valid & contains number 3:" +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09034678894"));

        //USING BI-PREDICATE PERSONAL EXAMPLE
        System.out.println(example.test("rabbit", "repository"));

    }
//CREATING NORMAL JAVA FUNCTION
    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

//CREATING PREDICATE FUNCTION
static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() ==11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

//CREATING A BI-PREDICATE
static BiPredicate<String, String> example = (first, second) -> (first.contains("ab") && (second.contains("rep")));

}
