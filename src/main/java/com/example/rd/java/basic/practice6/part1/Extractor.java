package com.example.rd.java.basic.practice6.part1;

import java.util.ArrayList;
import java.util.List;

public class Extractor {
    private String[] source;

    public Extractor(String[] source) {
        this.source = source;
    }

    public List<Word> extract() {
        List<Word> valueList = new ArrayList<>();
        for (String w : source) {
            Word word = new Word(w);
            int index = valueList.indexOf(word);
            if (index == -1) {
                valueList.add(word);
            } else {
                valueList.get(index).incFrequency();
            }
        }
        return valueList;
    }
}
