package com.gulci.java.sda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {

    // ctrl+shift+a - action

    // psvm
    public static void main(String[] args) {

        System.out.println("hello");

        if (args.length > 0) {
            List<String> argsList = Arrays.asList(args);
            argsList.forEach(System.out::println);
        } else {
            System.out.println("No parameters.");
        }

        System.out.println();

        // Arrays.asList() creates fixed-size list
        List<Integer> ageList = new ArrayList<>(Arrays.asList(0, 2, 4, 33, 34));
        ageList.add(69);
        ageList.stream().sorted().forEach(System.out::println);

        System.out.println();

        int weight = 81;
        double height = 1.9;
        System.out.println(weight / (height * height));

        // or (double) cast
        double weightImproved = weight * (15.0 / 16);
        System.out.println(weightImproved / (height * height));
    }
}
