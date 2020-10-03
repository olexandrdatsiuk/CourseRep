package com.example.rd.java.basic.practice6.part4;

public class Part4 {

    public static void main(String[] args) {
        final int firstValue = -1;
        final int lastValue = 3;

        printRangeWithIterator(new Range(firstValue, lastValue));
        printRangeWithIterator(new Range(firstValue, lastValue, true));

    }

    public static void printRangeWithIterator(Range range) {
        for (int integer : range) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}
