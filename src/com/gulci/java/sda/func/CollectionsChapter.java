package com.gulci.java.sda.func;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionsChapter {

    public static void main(String[] args) {

        // immutable
        final List<String> cities = Arrays.asList(
                "Los Angeles",
                "San Francisco",
                "San Diego",
                "Sacramento",
                "Santa Barbara",
                "Oakland",
                "San Jose"
        );

        // how + what
        // sel-inflicted wound pattern
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }

        // how + what
        // uses Iterator interface and methods hasNext() and next()
//        for (String city : cities) {
//            System.out.println(city);
//        }

        // tell what you want to do, don't ask for a specific iteration
        // invoking a method on a collection - polymorphic, for - non-polymorphic

        // Iterable interface and forEach()
//        cities.forEach(new Consumer<String>() {
//            public void accept(final String city) {
//                System.out.println(city);
//            }
//        });

        // inferred parameters are non-fianl
//        cities.forEach(name -> System.out.println(name));
    }
}
