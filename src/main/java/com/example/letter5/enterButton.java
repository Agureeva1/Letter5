package com.example.letter5;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

import static com.example.letter5.AlphabetCharButton.getPressButton;
import static com.example.letter5.AlphabetCharButton.setPressButton;
import static com.example.letter5.Dictionary.getDictionary;
import static com.example.letter5.FreeSpaceForLetter.getAllSp;
import static com.example.letter5.FreeSpaceForLetter.getLetterInSpace;
import static com.example.letter5.HiddenWord.*;
import static com.example.letter5.InputWord.getInputWord;
import static com.example.letter5.Mark.getMark;
import static com.example.letter5.StaticNumbers.*;

public class enterButton {
    private static Button enter;


    public static Button creteEnterButton() {
        enter = new Button("V");
        enter.setOnAction(e -> {

            if (getCountLetter() == 5 && getCountWord() < getNumberAttempt()) {
                if (getHiddenWord().equals(getInputWord())) {
                    for (int i = 0; i < getCountLetter(); i++) {
                        getLetterInSpace()[getCountWord()][i].setStyle(
                                " -fx-border-width: 1;" +
                                        "-fx-border-radius: 5;" +
                                        " -fx-border-color: black;" +
                                        "-fx-background-color:yellow;");
                    }

                } else {
                    boolean isExist;

                    isExist = getDictionary().stream()
                            .anyMatch(s -> s.startsWith(getInputWord()));

                    if (isExist == true) {
                        setPressButton(new ArrayList<>());
                        List<Integer> indexInputWord = new ArrayList<>();
                        for (int i = 0; i < getCountLetter(); i++) {
                            char input = getInputWord().charAt(i);
                            char hidden = getHiddenWord().charAt(i);
                            if (input == hidden) {
                                getLetterInSpace()[getCountWord()][i].setStyle(
                                        " -fx-border-width: 1;" +
                                                "-fx-border-radius: 3;" +
                                                " -fx-border-color: black;" +
                                                "-fx-background-color:yellow;");
                                getCharHiddenWord().set(i, '!');
                            } else {
                                indexInputWord.add(i);
                            }
                        }

                        for (int i = 0; i < indexInputWord.size(); i++) {
                            char input = getInputWord().charAt(indexInputWord.get(i));
                            //System.out.println("Ищем букву " + input);
                            if (getCharHiddenWord().contains(input)) {
                                //   System.out.println(getCharHiddenWord() + "включает в себя" + input);
                                for (int j = 0; j < getCharHiddenWord().size(); j++) {
                                    if (getCharHiddenWord().get(j) == input) {
                                        getLetterInSpace()[getCountWord()][indexInputWord.get(i)].setStyle(
                                                " -fx-border-width: 1;" +
                                                        "-fx-border-radius: 3;" +
                                                        " -fx-border-color: black;" +
                                                        "-fx-background-color: white;");
                                        getCharHiddenWord().set(j, '!');
                                    }
                                }
                            }
                        }
                        createCharHiddenWord();
                        setCountLetter(0);
                        setCountWord(getCountWord() + 1);
                        switch (getCountWord()) {
                            case 1:
                                getAllSp()[0].getChildren().add(getMark());
                                break;
                            case 2:
                                getAllSp()[1].getChildren().add(getMark());
                                break;
                            case 3:
                                getAllSp()[2].getChildren().add(getMark());
                                break;
                            case 4:
                                getAllSp()[3].getChildren().add(getMark());
                                break;
                            case 5:
                                getAllSp()[4].getChildren().add(getMark());
                                break;
                            case 6:
                                getAllSp()[5].getChildren().add(getMark());
                                break;
                        }
                        System.out.println("Слово есть в словаре");
                    }
                    if (isExist == false) {
                        System.out.println("Слова НЕТ в словаре");
                        for (int i = 0; i < getPressButton().size(); i++) {
                            getPressButton().get(i).setStyle("");
                        }

                        for (int i = 0; i < getCountLetter(); i++) {
                            getLetterInSpace()[getCountWord()][i].setText("");
                        }
                        setCountLetter(0);
                    }
                }
            }
        });
        enter.setStyle(
                " -fx-border-width: 1;" +
                        "-fx-border-radius: 5;" +
                        " -fx-border-color: black;" +
                        "-fx-background-color: yellow;");
        return enter;
    }

}
