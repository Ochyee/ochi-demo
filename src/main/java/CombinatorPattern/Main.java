package CombinatorPattern;

import java.time.LocalDate;

import static CombinatorPattern.CustomerRegisterationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2000,1,1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        //System.out.println(validatorService.isValid(customer)); //method1
       // System.out.println(new CustomerValidatorService().isValid(customer)); //method2

        //if valid we can store customer in db

        //Using combinator
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }


    }
}
