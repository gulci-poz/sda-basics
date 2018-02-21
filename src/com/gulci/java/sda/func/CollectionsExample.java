package com.gulci.java.sda.func;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {

        List<String> coll
                = Collections.unmodifiableList(Arrays.asList("Poznań", "Warszawa"));
    }
}
