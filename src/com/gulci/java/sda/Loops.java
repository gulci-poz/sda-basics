package com.gulci.java.sda;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            total += scanner.nextInt();
        }

        System.out.println("Total: " + total);
    }
}
