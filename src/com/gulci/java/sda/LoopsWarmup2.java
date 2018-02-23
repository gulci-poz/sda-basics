package com.gulci.java.sda;

import java.util.Scanner;

public class LoopsWarmup2 {

    public static void main(String[] args) {

        // 1
//        System.out.print("Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        int numIter = num;
//        int newNum = 0;
//
//        while (numIter > 0) {
//            int digit = numIter % 10;
//            // option 2 - reverse and no zeros inside
//            //if (digit != 0) {
//            if (digit != 0 || (digit == 0 && num == numIter)) {
//                newNum = newNum * 10 + digit;
//            }
//            numIter /= 10;
//        }
//
//        System.out.println("New number: " + newNum);

        // 2
//        System.out.print("How many numbers you want to enter: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int nIter = n - 1;
//
//        int[] numbers = new int[n];
//
//        while (nIter >= 0) {
//            System.out.print("Enter number " + (nIter + 1) + ": ");
//            numbers[nIter] = scanner.nextInt();
//            nIter -= 1;
//        }
//
//        int total = 0;
//
//        for (int i = 0; i < n; i++) {
//            int num = numbers[i];
//            while (num > 0) {
//                total += (num % 10);
//                num /= 10;
//            }
//        }
//
//        System.out.println("Sum of all digits is: " + total);

        // 3
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int numIter = num;
        int newNum = 0;
        int mult = 1;

        while (numIter > 0) {
            int digit = numIter % 10;

            if (digit != 0) {
                newNum += (digit * mult);
                mult *= 10;
            }

            numIter /= 10;
        }

        System.out.println("New number: " + newNum);
    }
}
