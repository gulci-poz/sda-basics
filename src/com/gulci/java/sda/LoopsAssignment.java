package com.gulci.java.sda;

import java.util.*;
import java.util.stream.IntStream;

public class LoopsAssignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a number: ");
        int n = scanner.nextInt();

        System.out.println("Numbers");
        IntStream.rangeClosed(1, n).forEach(System.out::println);
        System.out.println();

        System.out.println("Doubles");
        IntStream.rangeClosed(1, n).map(num -> num * 2).forEach(System.out::println);
        System.out.println();

        System.out.println("Evens");
        IntStream.rangeClosed(1, n).filter(num -> num % 2 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("Divisible by 3");
        IntStream.rangeClosed(1, n).filter(num -> num % 3 == 0).forEach(System.out::println);
        System.out.println();

        System.out.println("n times a");
        IntStream.rangeClosed(1, n).mapToObj(num -> "a").forEach(System.out::println);
        System.out.println();

        System.out.println("squares");
        IntStream.rangeClosed(1, n).mapToDouble(num -> Math.pow(num, 2)).forEach(System.out::println);
        System.out.println();

        System.out.println("sums");
        IntStream.rangeClosed(1, n).map(num -> IntStream.rangeClosed(1, num).sum()).forEach(System.out::println);
        System.out.println();
    }
}
