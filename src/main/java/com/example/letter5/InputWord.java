package com.example.letter5;


public class InputWord {
    private static String inputWord;

    public static String getInputWord() {
        inputWord= String.valueOf(FreeSpaceForLetter.getWordFromSpace());
        return inputWord;
    }
}
