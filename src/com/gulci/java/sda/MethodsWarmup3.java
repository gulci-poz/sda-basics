package com.gulci.java.sda;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.math3.primes.*;

public class MethodsWarmup3 {

    public static void main(String[] args) {

        String[] array1 = {"ala", "ma", "kota"};
        System.out.println(Arrays.toString(reverseArray(array1)));

        System.out.println(buildTree(3));

        System.out.println(compareNumbers("12346", "12346"));
        System.out.println();

        System.out.println(factorSum(99));
    }

    private static String[] reverseArray(String[] array) {
        String[] reversedArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;
    }

    private static String buildTree(int height) {
        StringBuilder treeBuilder = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                treeBuilder.append(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                treeBuilder.append("*");
            }

            treeBuilder.append("\n");
        }

        return treeBuilder.toString();
    }

    private static int compareNumbers(String number1, String number2) {
        if (number1.length() > number2.length()) {
            return 1;
        } else if (number1.length() < number2.length()) {
            return 2;
        }

        int i = 0;

        while (i < number1.length()) {
            if (number1.charAt(i) > number2.charAt(i)) {
                return 1;
            } else if (number1.charAt(i) < number2.charAt(i)) {
                return 2;
            }

            i++;
        }

        return 0;
    }

    private static ArrayList<Integer> primes(int num) {
        int i = 2;

        ArrayList<Integer> primes = new ArrayList<>();

        while (i <= num) {
            i = Primes.nextPrime(i);
            primes.add(i);
            i++;
        }

        return primes;
    }

    private static String factorSum(int num) {
        ArrayList<Integer> primes = primes(num);
        int factor = num;

        StringBuilder expr = new StringBuilder();
        expr.append(num);
        expr.append(" = ");

        if (num == primes.get(primes.size() - 1)) {
            expr.append(num);
            return expr.toString();
        }

        for (int i = primes.size() - 1; i >= 0; i--) {
            while (factor >= primes.get(i)) {
                factor -= primes.get(i);
                if (!expr.toString().endsWith(" = ")) {
                    expr.append(" + ");
                }
                expr.append(primes.get(i));
            }

            if (factor == 0) {
                break;
            }
        }

        return expr.toString();
    }
}
