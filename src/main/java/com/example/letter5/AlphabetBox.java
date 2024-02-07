package com.example.letter5;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import static com.example.letter5.AlphabetCharButton.creteButtonLetter;
import static com.example.letter5.AlphabetCharButton.getButtonAlphabetLetter;
import static com.example.letter5.DelLetterButton.creteDelButton;
import static com.example.letter5.enterButton.creteEnterButton;

public class AlphabetBox {
    private static HBox hBox1 = new HBox();
    private static HBox hBox2 = new HBox();
    private static HBox hBox3 = new HBox();
    private static VBox vBox = new VBox();

    public static VBox creteBoxButton() {
        creteButtonLetter();
        hBox3.getChildren().add(creteEnterButton());
        for (int i = 0; i < getButtonAlphabetLetter().length; i++) {
            if (i < 13) {
                hBox1.getChildren().add(getButtonAlphabetLetter()[i]);
            } else if (i < 24) {
                hBox2.getChildren().add(getButtonAlphabetLetter()[i]);
            } else {
                hBox3.getChildren().add(getButtonAlphabetLetter()[i]);
            }
        }
        hBox1.setAlignment(Pos.CENTER);
        hBox2.setAlignment(Pos.CENTER);
        hBox3.setAlignment(Pos.CENTER);
        hBox3.getChildren().add(creteDelButton());
        vBox.getChildren().addAll(hBox1, hBox2, hBox3);

        return vBox;
    }
}
