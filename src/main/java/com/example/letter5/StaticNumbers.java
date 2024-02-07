package com.example.letter5;

public class StaticNumbers {
    private static int numberAttempt = 6;
    private static int numberLetterInWord = 5;
    private static int countLetter = 0;
    private static int countWord = 0;

    public static int getNumberAttempt() {
        return numberAttempt;
    }
    public static int getNumberLetterInWord() {
        return numberLetterInWord;
    }

    public static int getCountLetter() {
        return countLetter;
    }

    public static int getCountWord() {
        return countWord;
    }

    public static void setCountLetter(int countLetter) {
        StaticNumbers.countLetter = countLetter;
    }

    public static void setCountWord(int countWord) {
        StaticNumbers.countWord = countWord;
    }
}
