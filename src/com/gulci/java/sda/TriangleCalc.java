package com.gulci.java.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TriangleCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> sides = new ArrayList<>(3);

        System.out.print("a = ");
        sides.add(0, scanner.nextDouble());
        System.out.print("b = ");
        sides.add(1, scanner.nextDouble());
        System.out.print("b = ");
        sides.add(2, scanner.nextDouble());

        boolean triangle = ((sides.get(0) + sides.get(1) > sides.get(2))
                && (sides.get(0) + sides.get(2) > sides.get(1))
                && (sides.get(1) + sides.get(2) > sides.get(0)));

        System.out.println("Triangle: " + triangle);

        if (triangle) {
            System.out.println("Circumference: " + (sides.stream().reduce(0.0, Double::sum)));
            System.out.println("Average length: " + (sides.stream().reduce(0.0, Double::sum) / sides.size()));

            List<Double> sidesSorted = sides.stream().sorted().collect(Collectors.toList());

            boolean right = (Math.pow(sidesSorted.get(0), 2)
                    + Math.pow(sidesSorted.get(1), 2)
                    == Math.pow(sidesSorted.get(2), 2));

            System.out.println("Right-angled: " + right);

            if (right) {
                System.out.println("Area: " + (0.5 * sidesSorted.get(0) * sidesSorted.get(1)));
            }
        }
    }
}
