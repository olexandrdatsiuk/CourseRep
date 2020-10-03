package com.example.rd.java.basic.practice6.part6;

public class Part6 {
    public static void main(String[] args) {
        if (args.length < 4) {
            throw new IllegalArgumentException("Must be 4 arguments. Now: " + args.length);
        }

        ArgParser parser = new ArgParser(args);
        parser.parse();
        parser.execute();
    }

}