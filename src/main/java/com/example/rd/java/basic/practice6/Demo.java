package com.example.rd.java.basic.practice6;

import com.example.rd.java.basic.practice6.part1.Part1;
import com.example.rd.java.basic.practice6.part2.Part2;
import com.example.rd.java.basic.practice6.part3.Part3;
import com.example.rd.java.basic.practice6.part4.Part4;
import com.example.rd.java.basic.practice6.part5.Part5;
import com.example.rd.java.basic.practice6.part6.Part6;

public class Demo {

    static int a;

    public static void main(String[] args) {
        final String header = "============================== PART%d%n";

        System.out.printf(header, 1);
        Part1.main(args);

        System.out.printf(header, 2);
        Part2.main(args);

        System.out.printf(header, 3);
        Part3.main(args);

        System.out.printf(header, 4);
        Part4.main(args);

        System.out.printf(header, 5);
        Part5.main(args);

        System.out.printf(header, 6);
        Part6.main(new String[]{"-i", "part6.txt", "-t", "length"});
        Part6.main(new String[]{"-i", "part6.txt", "--task", "duplicates"});
        Part6.main(new String[]{"--task", "frequency", "--input", "part6.txt"});
    }

}
