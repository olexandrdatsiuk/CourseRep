package com.example.rd.java.basic.practice6.part1;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleReader {
    private InputStream is;

    public ConsoleReader(InputStream is) {
        this.setIs(is);
    }

    public String readToToken(String token) {
        Scanner scanner = new Scanner(is);
        StringBuilder wordsFromConsole = new StringBuilder();
        String word;
        while (!token.equals((word = scanner.next()))) {
            wordsFromConsole.append(word).append(' ');
        }
        return wordsFromConsole.toString();
    }

    public void setIs(InputStream is) {
        this.is = is;
    }
}
