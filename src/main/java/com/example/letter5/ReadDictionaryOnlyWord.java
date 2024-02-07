package com.example.letter5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ReadDictionaryOnlyWord {
    public static void main(String[] args) throws IOException {
        var contents = new String(Files.readAllBytes(
                Paths.get("src/fails/dicTest.txt")), StandardCharsets.UTF_8);

        List<String> words = Arrays.asList(contents.replaceAll("\n", " ").split(" "));
        for (int i = 0; i < words.size(); i++) {
            if (i % 2 == 1) {
                System.out.println(words.get(i));
            }
        }

    }
}
