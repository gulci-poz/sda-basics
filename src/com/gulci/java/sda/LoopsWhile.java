package com.gulci.java.sda;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LoopsWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        // 1

//        num = 1;
//
//        while (num % 15 != 0) {
//            System.out.print("Enter a number: ");
//            num = scanner.nextInt();
//        }
//
//        System.out.println("Your number is divisible by 15.");

        // 2
//        int total = 0;
//        num = 1;
//
//        while (num != 0) {
//            System.out.print("Enter next value: ");
//            num = scanner.nextInt();
//            total += num;
//            System.out.println("Total is: " + total);
//        }

        // 3
//        int mem = 1;
//        num = 1;
//
//        while (num != 0) {
//            System.out.print("Enter next value: ");
//            num = scanner.nextInt();
//            mem = num > mem ? num : mem;
//        }
//
//        System.out.println("The biggest value was: " + mem);

        // 4
//        System.out.print("Enter a value: ");
//        num = scanner.nextInt();
//        System.out.println("Number of digits: " + String.valueOf(num).length());

        // 5
//        System.out.print("Enter a value: ");
//        num = scanner.nextInt();
//        int digitSum = 0;
//
//        while (num % 10 > 0) {
//            digitSum += (num % 10);
//            num = num / 10;
//        }
//
//        System.out.println(digitSum);

        // 6
//        System.out.print("Enter a value: ");
//        num = scanner.nextInt();
//
//        System.out.print("Enter a digit: ");
//        int digit = scanner.nextInt();
//
//        int counter = 0;
//
//        while (num % 10 > 0) {
//            if (num % 10 == digit) {
//                counter++;
//            }
//            num = num / 10;
//        }
//
//        System.out.println(counter);

        // 7
//        System.out.print("Enter a value: ");
//        num = scanner.nextInt();
//        int div = num;
//
//        while (div > 0) {
//            if (num % div == 0) {
//                System.out.println(div);
//            }
//
//            div--;
//        }

        // 8
//        System.out.print("Enter a value: ");
//        num = scanner.nextInt();
//        int div = num / 2;
//
//        while (div > 1 && num % div != 0) {
//            div--;
//        }
//
//        if (div == 1) {
//            System.out.println("Primary number");
//        } else {
//            System.out.println("Not a primary number");
//        }

        // 9 - bin
        long bin = Long.valueOf(Long.toBinaryString(99));
        System.out.println(Long.toBinaryString(199912345698761L));
        System.out.println(bin);
        System.out.println(0b1100011);
    }
}
