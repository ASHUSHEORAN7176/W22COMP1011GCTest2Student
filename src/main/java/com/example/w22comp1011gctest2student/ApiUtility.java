/*
 *Student Name-Ashu Sheoran
 * Student id -200485170
 */
package com.example.w22comp1011gctest2student;

import java.io.FileReader;
import java.util.ArrayList;


public class ApiUtility {
    public static ArrayList<Customer> getCustomersFromJSONFileArray(String fileName) {
        Gson gson = new Gson();


        try (
                //open the json file from the harddrive
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            //converting the JSON objects using google script object notation.
            Customer customers = gson.fromJson(jsonReader, Customer.class);

            ArrayList<Customer> arrayList = new ArrayList<>();

            arrayList.add(customers);
            System.out.println(customers);
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}