package com.example.letter5;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

import static com.example.letter5.AlphabetCharButton.getButtonAlphabetLetter;
import static com.example.letter5.AlphabetCharButton.setPressButton;
import static com.example.letter5.FreeSpaceForLetter.getAllSp;
import static com.example.letter5.FreeSpaceForLetter.getLetterInSpace;
import static com.example.letter5.HiddenWord.createCharHiddenWord;
import static com.example.letter5.HiddenWord.createHiddenWord;
import static com.example.letter5.Mark.getMark;
import static com.example.letter5.StaticNumbers.*;

public class NewPlayButton {

    private static Button newPlay;

    public static HBox createNewPlayButton() {
        newPlay = new Button("НОВАЯ ИГРА");
        newPlay.setOnAction(e ->
        {
            switch (getCountWord()) {
                case 1:
                    getAllSp()[0].getChildren().remove(getMark());
                    break;
                case 2:
                    getAllSp()[1].getChildren().remove(getMark());
                    break;
                case 3:
                    getAllSp()[2].getChildren().remove(getMark());
                    break;
                case 4:
                    getAllSp()[3].getChildren().remove(getMark());
                    break;
                case 5:
                    getAllSp()[4].getChildren().remove(getMark());
                    break;
                case 6:
                    getAllSp()[5].getChildren().remove(getMark());
                    break;
            }
            setPressButton(new ArrayList<>());
            for (int i = 0; i < getButtonAlphabetLetter().length; i++) {
                if (getButtonAlphabetLetter()[i].getStyle().equals(
                        " -fx-border-width: 1;-fx-border-radius: 3;-fx-background-color: CADETBLUE;"))
                    getButtonAlphabetLetter()[i].setStyle("");
            }
            for (int i = 0; i < getLetterInSpace().length; i++) {
                for (int j = 0; j < getLetterInSpace()[i].length; j++) {
                    getLetterInSpace()[i][j].setStyle(
                            " -fx-border-width: 1;" +
                                    "-fx-border-radius: 3;" +
                                    " -fx-border-color: black;" +
                                    "-fx-background-color: \"5F9EA0\";");
                    if (!getLetterInSpace()[i][j].getText().equals(""))
                        getLetterInSpace()[i][j].setText("");
                }
            }
            createHiddenWord();
            setCountLetter(0);
            setCountWord(0);
            createCharHiddenWord();
        });
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(newPlay);
        return hb;
    }

}
