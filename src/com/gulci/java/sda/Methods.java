package com.gulci.java.sda;

import java.util.*;

public class Methods {

    public static void main(String[] args) {

        // fori
        // alt+ctrl+m - extract method

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1};
        int[] numbers2 = {3, 2, 2, 5, 1, 1, 1};
        System.out.println("sumArray: " + sumArray(numbers));
        System.out.println("averageArray: " + averageArray(numbers));
        System.out.println("min: " + minArray(numbers));
        System.out.println("max: " + maxArray(numbers));
        System.out.println("range: " + rangeArray(numbers));

        System.out.println("distribution:");
        int[] distribution = distributionArray(numbers2);

        for (int i = 0; i < distribution.length; i++) {
            System.out.println("val " + (i + 1) + ": " + distribution[i]);
        }

        System.out.println("sorting:");
        int[] sortedArray = sortArray(numbers2);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    private static int sumArray(int[] numbers) {
        /*
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
        */

        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

    private static double averageArray(int[] numbers) {
        return sumArray(numbers) / numbers.length;
    }

    private static int minArray(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            min = min <= array[i] ? min : array[i];
        }

        return min;
    }

    private static int maxArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }

        return max;
    }

    private static int rangeArray(int[] array) {
        return maxArray(array) - minArray(array) + 1;
    }

    private static int[] distributionArray(int[] array) {
        int[] occurances = new int[rangeArray(array)];

        int range = rangeArray(array);
        int current = minArray(array);

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == current) {
                    occurances[i]++;
                }
            }
            current++;
        }

        return occurances;
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];

        int current = minArray(array);
        int index = 0;

        int[] distribution = distributionArray(array);

        for (int i = 0; i < distribution.length; i++) {
            for (int j = 0; j < distribution[i]; j++) {
                sortedArray[index] = current;
                index++;
            }

            current++;
        }

        return sortedArray;
    }

    private static int moda(int[] array) {
        int[] stats = distributionArray(array);
        int indexOfMaximumValue = indexOfMax(stats);
        return indexOfMaximumValue + minArray(array);
    }

    private static int indexOfMax(int[] array) {
        // finish moda
        return 1;
    }
}
