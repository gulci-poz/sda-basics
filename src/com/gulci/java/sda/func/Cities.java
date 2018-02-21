package com.gulci.java.sda.func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>(
                Arrays.asList("Los Angeles", "San Francisco", "Chicago", "San Diego")
        );
        boolean found = false;

        for (String city : cities) {
            if (city.equals("Chicago")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Chicago found.");
        } else {
            System.out.println("Chicago not found.");
        }


        System.out.println("Chicago found: " + cities.contains("Chicago"));
    }
}
