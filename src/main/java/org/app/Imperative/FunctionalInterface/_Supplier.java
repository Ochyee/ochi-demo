package org.app.Imperative.FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getDBConnectionURLSupplier2.get());
    }

//CREATING REGULAR JAVA FUNCTION
    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

//CREATING SUPPLIER FUNCTIONAL INTERFACE
static Supplier<String> getDBConnectionURLSupplier =
        () -> "jdbc://localhost:5432/users";

//CREATING SUPPLIER INTERFACE RETURNING LIST
static Supplier<List<String>> getDBConnectionURLSupplier2 =
        () ->List.of( "jdbc://localhost:5432/users");

}
