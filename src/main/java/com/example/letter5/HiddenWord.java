package com.example.letter5;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.example.letter5.Dictionary.getDictionary;

public class HiddenWord {

    private static String hiddenWord;
    private static List<Character> charHiddenWord;


    public static String getHiddenWord() {
        return hiddenWord;
    }

    public static List<Character> getCharHiddenWord() {
        return charHiddenWord;
    }

    public static void createHiddenWord() {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        String str = getDictionary().get(r.nextInt(0, getDictionary().size()));
        hiddenWord = str.substring(0, str.length() - 1);
        System.out.println("Загадано слово " + hiddenWord);
    }

    public static void createCharHiddenWord() {
        charHiddenWord = new ArrayList();
        for (char ch : getHiddenWord().toCharArray()) {
            getCharHiddenWord().add(ch);
        }
    }

}