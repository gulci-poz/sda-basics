package com.gulci.java.sda;

import java.util.ArrayList;
import java.util.List;

public class Ranges {

    public static void main(String[] args) {

        // 1
        int num = 125;
        List<Integer> binaryAux = new ArrayList<>();

        while (num > 0) {
            binaryAux.add(num % 2);
            num /= 2;
        }

        List<Integer> binary = new ArrayList<>();

        for (int i = binaryAux.size() - 1; i >= 0; i--) {
            binary.add(binaryAux.get(i));
        }

        System.out.println(binary);
    }
}
