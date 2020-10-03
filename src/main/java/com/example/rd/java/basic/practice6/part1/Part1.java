package com.example.rd.java.basic.practice6.part1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Part1 {
    public static final InputStream STD_IN = System.in;

    public static void main(String[] args) {
        final String input = "asd 43 asdf asd 43\n" +
                "\n" +
                "434 asdf \n" +
                "\n" +
                "kasdf asdf stop asdf\n" +
                "\n" +
                "stop";

        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        WordContainer.main(null);

        System.setIn(STD_IN);
    }
}