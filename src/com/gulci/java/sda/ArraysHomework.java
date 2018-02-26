package com.gulci.java.sda;

import java.util.Arrays;

public class ArraysHomework {


    public static void main(String[] args) {

        // works up to 6: 90 + 7 = 97 => into small letters

        // 1 "szyfr Cezara" - encode

        int offset = 6;
        String secretMessage = "Ala ma kota";

        char[] chars = secretMessage.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            // space
            if (chars[i] != ' ') {
                // all letters
                // A-Z => 65-90; a-z => 97 => 122
                if ((chars[i] >= 'a' && chars[i] <= 'z')
                        || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                    // next after Z, not small letter
                    if ((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') {
                        chars[i] = (char) (('a' + offset) % 26);
                    } // for small letters
                    else if ((chars[i] + offset) > 'z') {
                        chars[i] = (char) (('A' + offset) % 26);
                    } else {
                        chars[i] += offset;
                    }
                }
            }
        }

        String expectedMessage = "Grg sg quzg";

        System.out.println(chars);
        System.out.println(expectedMessage);

        System.out.println("Correct = " + (expectedMessage.equals(String.valueOf(chars))));

        // 2 "szyfr Cezara" - decode

        System.out.println();

        int offsetDecode = 6;
        String codeMessage = "Grg sg quzg";

        // select, alt+j
        char[] code = codeMessage.toCharArray();

        for (int i = 0; i < code.length; i++) {
            // space
            if (code[i] != ' ') {
                // all letters
                // A-Z => 65-90; a-z => 97 => 122
                if ((code[i] >= 'a' && code[i] <= 'z')
                        || (code[i] >= 'A' && code[i] <= 'Z')) {
                    // go back
                    if (code[i] == 'a' || code[i] == 'A') {
                        code[i] = (char) ((code[i] - offsetDecode) % 26);
                    } else {
                        code[i] -= offsetDecode;
                    }
                }
            }
        }

        String decodedMessage = "Ala ma kota";

        System.out.println(code);
        System.out.println(decodedMessage);

        System.out.println("Correct = " + (decodedMessage.equals(String.valueOf(code))));

        // 3 subtablice, wartość dzieląca, posortowana tablica

        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int searchNumber = 55;

        int pos = 0;

        while (pos < numbers.length && numbers[pos] < searchNumber) {
            pos++;
        }

        int[] smallerNumbers = new int[pos];
        int[] largerNumbers = new int[numbers.length - pos];

        for (int i = 0; i < smallerNumbers.length; i++) {
            smallerNumbers[i] = numbers[i];
        }

        for (int i = 0; i < largerNumbers.length; i++) {
            largerNumbers[i] = numbers[i + smallerNumbers.length];
        }

        System.out.println(Arrays.toString(smallerNumbers));
        System.out.println(Arrays.toString(largerNumbers));
    }

}
