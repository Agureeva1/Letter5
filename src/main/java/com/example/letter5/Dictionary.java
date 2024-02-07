package com.example.letter5;

import javafx.scene.layout.VBox;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Dictionary {
    private static List<String> dictionary;

    public static void createDictionary() throws IOException {
        var contents = new String(Files.readAllBytes(
                Paths.get("src/fails/dicTest.txt")), StandardCharsets.UTF_8);
        dictionary = Arrays.asList ( contents . split ( "\n"));
    }

    public static List<String> getDictionary() {
        return dictionary;
    }

}
