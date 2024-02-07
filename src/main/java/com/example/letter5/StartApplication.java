package com.example.letter5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.letter5.AlphabetBox.creteBoxButton;
import static com.example.letter5.Dictionary.createDictionary;
import static com.example.letter5.HiddenWord.createCharHiddenWord;
import static com.example.letter5.HiddenWord.createHiddenWord;
import static com.example.letter5.NewPlayButton.createNewPlayButton;


public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        createDictionary();
        createHiddenWord();
        createCharHiddenWord();
        HBox cap = new HBox(new Label());
        HBox cap1 = new HBox(new Label());
        HBox cap2 = new HBox(new Label());
        VBox vb = new VBox(cap, FreeSpaceForLetter.createSpaceForLetter(), cap1, creteBoxButton(), cap2, createNewPlayButton());
        Scene scene = new Scene(vb, 350, 400);
        stage.setTitle("5Букв");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }

    public static void main(String[] args) {
        launch();
    }
}