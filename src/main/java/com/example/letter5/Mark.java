package com.example.letter5;

import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class Mark {

      final static javafx.scene.image.Image m = new javafx.scene.image.Image("file:src/fails/check-mark.png");
    static ImageView mark= new ImageView(m);

    public static ImageView getMark() {
        return mark;
    }
}
