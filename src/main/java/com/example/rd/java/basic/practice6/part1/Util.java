package com.example.rd.java.basic.practice6.part1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Util {
    private Util() {
    }

    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName), "cp1251");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString().trim();
        } catch (IOException ex) {
            System.err.println(Arrays.toString(ex.getStackTrace()));
        }
        return sb.toString();
    }
}