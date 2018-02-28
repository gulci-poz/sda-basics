package com.gulci.java.sda;

import java.util.Arrays;

public class MethodsWarmup2 {

    public static void main(String[] args) {

        String text = "AlA mA kOtA";
        System.out.println(text);
        System.out.println(changeCase(text));
        System.out.println("nth index: " + getNthIndexOf('a', "ala ma kota", 3));
        Arrays.asList(split("ala;ma;kota", ';')).forEach(System.out::println);
        Arrays.asList(split2("ala;ma;kota", ';')).forEach(System.out::println);
    }

    private static String changeCase(String text) {
        char[] chText = text.toCharArray();

        for (int i = 0; i < chText.length; i++) {
            chText[i] = changeCaseChar(chText[i]);
        }

        return String.valueOf(chText);
    }

    private static char changeCaseChar(char c) {
        char newCar = c;

        if (c >= 'A' && c <= 'Z') {
            newCar += 32;
        } else if (c >= 'a' && c <= 'z') {
            newCar -= 32;
        }

        return newCar;
    }

    private static String[] split(String message, char c) {
        int size = lettersCounter(message, c) + 1;
        String[] resultArray = new String[size];

        String textToPut = "";
        int j = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c) {
                textToPut += message.charAt(i);
                if (i == message.length() - 1) {
                    resultArray[j] = textToPut;
                }
            } else {
                resultArray[j] = textToPut;
                j++;
                textToPut = "";
            }
        }

        return resultArray;
    }

    private static String[] split2(String message, char c) {
        int size = lettersCounter(message, c) + 1;
        String[] resultArray = new String[size];

        int start;
        int end = -1;

        for (int i = 0; i < size; i++) {
            start = end + 1;
            end = getNthIndexOf(c, message, i + 1);
            resultArray[i] = message.substring(start, end);
        }

        return resultArray;
    }

    private static int lettersCounter(String message, char c) {
        char[] chars = message.toCharArray();
        int i = 0;
        int counter = 0;

        while (i < chars.length) {
            if (chars[i] == c) {
                counter++;
            }

            i++;
        }

        return counter;
    }

    private static int getNthIndexOf(char c, String text, int index) {
        char[] chars = text.toCharArray();
        int i = -1;

        while (i < chars.length && index > 0) {
            i++;

            if (i < chars.length && chars[i] == c) {
                index--;
            }
        }

        return i;
    }
}
