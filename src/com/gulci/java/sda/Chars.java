package com.gulci.java.sda;

import java.util.stream.IntStream;

public class Chars {

    public static void main(String[] args) {

        // prints small letters a-z
        IntStream.rangeClosed(97, 122)
                .mapToObj(i -> (char) i)
                .forEach(System.out::println);
    }
}
