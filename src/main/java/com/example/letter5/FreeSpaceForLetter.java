package com.example.letter5;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import static com.example.letter5.StaticNumbers.*;
import static com.example.letter5.StaticNumbers.getCountWord;

public class FreeSpaceForLetter {
    private static Button[][] letterInSpace = new Button[getNumberAttempt()][getNumberLetterInWord()];
    private static VBox allSpaceForLetter = new VBox();
    private static HBox[] allSp = new HBox[getNumberAttempt()];

    public static VBox createSpaceForLetter() {
        for (int i = 0; i < getNumberAttempt(); i++) {
            HBox inputWord = new HBox();
            allSp[i] = inputWord;
            inputWord.setAlignment(Pos.CENTER);
            inputWord.setSpacing(10);
            inputWord.setPadding(new Insets(5));
            for (int j = 0; j < getNumberLetterInWord(); j++) {
                Button bt = new Button();
                bt.setStyle(
                        " -fx-border-width: 1;" +
                                "-fx-border-radius: 3;" +
                                " -fx-border-color: black;" +
                                "-fx-background-color: \"5F9EA0\";");
                bt.setMinWidth(25.0);
                bt.setPadding(new Insets(0));
                inputWord.getChildren().add(bt);
                letterInSpace[i][j] = bt;
            }
            allSpaceForLetter.getChildren().add(inputWord);
        }
        return allSpaceForLetter;
    }

    public static Button[][] getLetterInSpace() {
        return letterInSpace;
    }

    public static StringBuffer getWordFromSpace() {
            StringBuffer wordFromSpace = new StringBuffer();
            if (getCountLetter()==getNumberLetterInWord()) {
                for (int i = 0; i < getNumberLetterInWord(); i++) {
                    wordFromSpace.append(getLetterInSpace()[getCountWord()][i].getText().toLowerCase());}
            }
            else {

                System.out.println("В слове меньше 5 букв");
            }
            return wordFromSpace;

        }

    public static HBox[] getAllSp() {
        return allSp;
    }
}
