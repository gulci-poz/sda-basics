package com.gulci.java.sda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, -5, 6, 7, 8, 9, 10};
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10);

        //

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Sum: " + total);
        System.out.println("Average: " + ((double) total / numbers.length));

        System.out.println("Sum stream: " + numbersList.stream().reduce(0, Integer::sum));

        //

        int min = 0;
        int max = 0;
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        System.out.println(Collections.max(numbersList));
        System.out.println(Collections.min(numbersList));

        //

        int countPositive = 0;
        for (int i : numbers) {
            if (i >= 0) {
                countPositive++;
            } else {
                break;
            }
        }

        System.out.println("Positive numbers before negative one: " + countPositive);

        //

        System.out.print("Numbers x 2: ");
        int[] numbersX2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersX2[i] = numbers[i] * 2;
            System.out.print(numbersX2[i] + " ");
        }
        System.out.println();

        //

        int n = 7;
        int[] elements = new int[n];

        System.out.print("New " + n + " array: ");
        for (int i = 0; i < n; i++) {
            elements[i] = i + 1;
            System.out.print(elements[i] + " ");
        }
        System.out.println();

        //

        n = 10;
        int[] evens = new int[10];

        System.out.print("Even numbers: ");
        for (int i = 0; i < n; i++) {
            evens[i] = i * 2;
            System.out.print(evens[i] + " ");
        }
        System.out.println();

        //

        n = 8;
        int[] dec = new int[8];

        System.out.print("Decreasing: ");
        for (int i = n - 1; i >= 0; i--) {
            dec[i] = i + 1;
            System.out.print(dec[i] + " ");
        }
        System.out.println();

        //

        n = 5;
        int[] sortedNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int smaller = 0;

        for (int i : sortedNums) {
            if (i < n) {
                smaller++;
            }
        }

        System.out.println("Smaller than " + n + ": " + smaller);

        // fori
        // .var
        // .sout
    }
}
