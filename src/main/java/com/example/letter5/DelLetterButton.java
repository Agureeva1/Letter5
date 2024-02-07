package com.example.letter5;

import javafx.geometry.Insets;
import javafx.scene.control.Button;

import static com.example.letter5.AlphabetCharButton.getPressButton;
import static com.example.letter5.FreeSpaceForLetter.getLetterInSpace;
import static com.example.letter5.StaticNumbers.*;
import static com.example.letter5.StaticNumbers.getCountLetter;

public class DelLetterButton {
    private static Button delLetter;

    public static Button creteDelButton() {
        delLetter = new Button("<-");

        delLetter.setStyle(
                " -fx-border-width: 1;" +
                        "-fx-border-radius: 5;" +
                        " -fx-border-color: black;" +
                        "-fx-background-color: yellow;");

        delLetter.setOnAction(e-> {
            if (getCountLetter()>0) {
                getLetterInSpace()[getCountWord()][getCountLetter() - 1].setText("");
                setCountLetter(getCountLetter() - 1);
                getPressButton().get(getPressButton().size()-1).setStyle("");
            }
        });

        delLetter.setPadding(new Insets(4.0));
        return delLetter;
    }
}
