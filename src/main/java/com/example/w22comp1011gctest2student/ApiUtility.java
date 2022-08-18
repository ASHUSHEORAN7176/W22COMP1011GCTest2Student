/*
 *Student Name-Ashu Sheoran
 * Student id -200485170
 */
package com.example.w22comp1011gctest2student;

import java.io.FileReader;

public class ApiUtility {
    public static ApiResponse getCustomersFromJSONFile(String fileName) {
        //create a GSON object to parse the objects
        Gson gson = new Gson();
        ApiResponse response = null;

        //try with resources - anything inside the () will "auto close"
        try (
                //open the json file from the hardrive
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            //converting the JSON objects into an ApiResponse object
            response = gson.fromJson(jsonReader, ApiResponse.class);
        }
        return customers;

    }
}