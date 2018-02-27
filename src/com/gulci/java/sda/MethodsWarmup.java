package com.gulci.java.sda;

public class MethodsWarmup {

    public static void main(String[] args) {

        String[] firstNames = {"Anna", "Marcin", "Jakub", "Hanna", "Jolanta",
                "Maria", "Agata", "Sebastian", "Justynian"};
        System.out.println("Female first name counter: "
                + countNames(firstNames, "na"));

        String sentence = "Ala ma kota";
        System.out.println("A and a count: "
                + countLettersCaseInsensitive(sentence, "a"));
        System.out.println("M and m count: "
                + countLettersCaseInsensitive(sentence, "M"));
        System.out.println("Count a in array: "
                + countLettersArray(firstNames, "a"));
    }

    private static int countNames(String[] names, String searchingValue) {
        int total = 0;

        for (int i = 0; i < names.length; i++) {
            /*
            if (firstNames[i].endsWith("a")) {
                total++;
            }
            */
            if (endsWith(names[i], searchingValue)) {
                total++;
            }
        }

        return total;
    }

    private static boolean endsWith(String name, String searchingValue) {
        boolean ends = false;

        if (searchingValue.length() <= name.length() && searchingValue.length() > 0) {
            if (name.toLowerCase()
                    .substring(name.length() - searchingValue.length(), name.length())
                    .equals(searchingValue.toLowerCase())) {
                ends = true;
            } else {
                ends = false;
            }
        }

        return ends;
    }

    private static int countLettersCaseInsensitive(String sentence, String letter) {
        char[] sentenceRefactored = sentence.toLowerCase().toCharArray();
        char letterRefactored = letter.toLowerCase().toCharArray()[0];
        int total = 0;

        for (int i = 0; i < sentenceRefactored.length; i++) {
            if (sentenceRefactored[i] == letterRefactored) {
                total++;
            }
        }

        return total;
    }

    private static int countLettersArray(String[] sentences, String letter) {
        int total = 0;

        for (String sentence : sentences) {
            total += countLettersCaseInsensitive(sentence, letter);
        }

        return total;
    }
}
