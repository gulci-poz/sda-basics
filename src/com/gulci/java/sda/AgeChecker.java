package com.gulci.java.sda;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        System.out.print("Specify your age: ");

        Scanner ageReader = new Scanner(System.in);
        int age = ageReader.nextInt();

        System.out.print("Destination: ");

        if (age < 6) {
            System.out.print("kindergarten");
        } else if (age < 12) {
            System.out.print("primary school");
        } else if (age < 16) {
            System.out.print("secondary school");
        } else if (age < 20) {
            System.out.print("high school");
        } else {
            System.out.println("university");
        }

        if (age > 30 && age % 3 == 0) {
            System.out.println("age: >30 and divisible by 3");
        }

        if ((age < 15 || age > 60) && age % 5 == 2) {
            System.out.println("age: <15 or >60 and divisible by 5 with reminder of 2");
        }
    }
}
