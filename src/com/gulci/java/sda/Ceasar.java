package com.gulci.java.sda;

public class Ceasar {

    public static void main(String[] args) {

        System.out.println(decodeCeasar("ALA", 4));
        System.out.println((int) 'L');
    }

    private static String decodeCeasar(String message, int offset) {
        char[] chars = message.toCharArray();

        offset = offset > 25 ? 25 : offset;

        for (int i = 0; i < chars.length; i++) {
            // space
            if (chars[i] != ' ') {
                // big letter and small letter
                if ((chars[i] >= 'A' && chars[i] <= 'Z')) {
                    chars[i] = (char) ('A' + ((chars[i] - 'A' + offset) % (offset + 1)));
                }
                // small letter
            }
        }

        return String.valueOf(chars);
    }
}
