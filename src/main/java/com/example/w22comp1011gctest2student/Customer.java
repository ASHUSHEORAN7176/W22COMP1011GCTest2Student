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
    public double totalPurchases(){
        return purchases;
    };

    public Customer(String firstName, String lastName, String phoneNumber, int id, List<Product> products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.products = products;
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

    public List<Product> getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }
}
