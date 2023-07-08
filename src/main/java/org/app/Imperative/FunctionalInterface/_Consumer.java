package org.app.Imperative.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //NORMAL JAVA FUNCTION USE
       Customer newCustomer = new Customer("Maria", "08033761523");
       greetCustomer(newCustomer);


       //USING BICONSUMER
        greetCustomerConsumerV2.accept(newCustomer, false);

       //USING CONSUMER FUNCTIONAL INTERFACE
        //greetCustomerConsumer.accept(maria);
    }

    //CREATING A CONSUMER FUNCTION
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
     "thanks for registering phone number " + customer.customerPhoneNumber);

    //CREATING A BICONSUMER FUNCTION
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " + (showPhoneNumber? customer.customerPhoneNumber: "********"));

    //NORMAL JAVA FUNCTION
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                " thanks for registering phone number " + customer.customerPhoneNumber);
    }




   static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;

        }

   }
}