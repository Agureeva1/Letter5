package com.example.letter5;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

import static com.example.letter5.FreeSpaceForLetter.getLetterInSpace;
import static com.example.letter5.StaticNumbers.*;


public class AlphabetCharButton {

    private static int alphabetSize = 33;
    private static char[] allLetter = {'Ё', 'Й', 'Ц', 'У', 'К', 'Е', 'Н', 'Г', 'Ш', 'Щ',
            'З', 'Х', 'Ъ', 'Ф', 'Ы', 'В', 'А', 'П', 'Р', 'О', 'Л', 'Д', 'Ж', 'Э', 'Я', 'Ч', 'С',
            'М', 'И', 'Т', 'Ь', 'Б', 'Ю'};
    private static Button[] buttonAlphabetLetter = new Button[alphabetSize];
    private static List<Button> pressButton = new ArrayList<>();

    public static void creteButtonLetter() {
        for (int i = 0; i < allLetter.length; i++) {
            Button bt = new Button();
            bt.setOnAction(e -> {
                if (getCountWord() < getNumberAttempt()) {
                    if (getCountLetter() < getNumberLetterInWord()) {
                        if (!bt.getStyle().equals(" -fx-border-width: 1;-fx-border-radius: 3;-fx-background-color: CADETBLUE;"))
                            pressButton.add(bt);
                        getLetterInSpace()[getCountWord()][getCountLetter()].setText(bt.getText());
                        setCountLetter(getCountLetter() + 1);
                        bt.setStyle(
                                " -fx-border-width: 1;" +
                                        "-fx-border-radius: 3;" +
                                        "-fx-background-color: CADETBLUE;");
                        //   System.out.println(bt.getStyle());
                    }
                }
            });
            bt.setText(String.valueOf(allLetter[i]));
            buttonAlphabetLetter[i] = bt;
        }
    }
//

    public static Button[] getButtonAlphabetLetter() {
        return buttonAlphabetLetter;
    }

    public static List<Button> getPressButton() {
        return pressButton;
    }

    public static void setPressButton(List<Button> pressButton) {

        AlphabetCharButton.pressButton = pressButton;
    }
}

