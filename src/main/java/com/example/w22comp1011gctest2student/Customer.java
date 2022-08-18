/*
 *Student Name-Ashu Sheoran
 * Student id -200485170
 */
package com.example.w22comp1011gctest2student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName,lastName,phoneNumber;
    private int id;
    public ArrayList<Product> purchases;
    List<Product> products;
    public double totalPurchases;


    public Customer(String firstName, String lastName, String phoneNumber, int id, ArrayList<Product> purchases, double totalPurchases) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.purchases = purchases;
        this.totalPurchases = totalPurchases;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public int getId() {
        return id;
    }

    public String getTotalSalesPrice() {
        return "$" + String.format("%.2f",
                getPurchases().stream().mapToDouble(arg0 -> arg0.getSalePrice()).reduce(0.0, (a, b) -> a + b));
    }

    public double getTotalSavings() {
        return getPurchases().stream().mapToDouble(arg0 -> arg0.getRegularPrice() -
                arg0.getSalePrice()).reduce(0.0,
                (a, b) -> a + b);
    }

    public Boolean isSavingHigh() {
        return getTotalSavings() >= 5;
    }
}
}
