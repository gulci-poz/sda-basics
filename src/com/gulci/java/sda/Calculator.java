package com.gulci.java.sda;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("CALCULATOR");
        System.out.println();

        Scanner valueScanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int firstValue = valueScanner.nextInt();

        System.out.print("Enter second value: ");
        int secondValue = valueScanner.nextInt();

//        System.out.println("First value: " + firstValue);
//        System.out.println("Second value: " + secondValue);

//        System.out.println("Add: " + (firstValue + secondValue));
//        System.out.println("Subtract: " + (firstValue - secondValue));
//        System.out.println("Multiply: " + (firstValue * secondValue));
//        System.out.println("Divide: " + ((double) firstValue / secondValue));

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println(firstValue + " / " + secondValue + " = " + ((double) firstValue / secondValue));

        if (secondValue != 0) {
            System.out.println(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
        } else {
            System.out.println("int division by zero.");
        }

        System.out.println("Equals: " + (firstValue == secondValue));
        System.out.println("Bigger number: " + Integer.max(firstValue, secondValue));
        System.out.println("Smaller number: " + Integer.min(firstValue, secondValue));
        System.out.println("Reminder: " + (firstValue % secondValue));
        System.out.println("First value even: " + ((firstValue % 2) == 0));
        System.out.println("Second value even: " + ((secondValue % 2) == 0));

        if (firstValue == 5 ^ secondValue == 10) {
            System.out.println("xor true");
        } else {
            System.out.println("xor false");
        }
    }
}
