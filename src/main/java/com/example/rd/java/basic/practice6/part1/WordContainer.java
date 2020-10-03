package com.example.rd.java.basic.practice6.part1;

import java.util.List;

public class WordContainer {
    private static final String STOP_KEY_WORD = "stop";

    public static void main(String[] args) {
        List<Word> wordList = new Extractor(new ConsoleReader(System.in).readToToken(STOP_KEY_WORD).split("\\s+")).extract();
        wordList.sort(Word::compareTo);
        wordList.forEach(w -> System.out.println(w.getContent() + " : " + w.getFrequency()));
    }
}