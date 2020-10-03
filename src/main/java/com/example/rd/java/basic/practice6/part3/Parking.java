package com.example.rd.java.basic.practice6.part3;

import com.example.rd.java.basic.practice6.part1.StringManipulator;

public class Parking {

    private final int[] places;

    private static final String ILLEGAL_ARGUMENT_EXCEPTION_MESSAGE = "Rule: k ∈ [0; parking capacity). Parking capacity: %d, k: %d";

    public Parking(int capacity) {
        places = new int[capacity];
    }

    public boolean arrive(int k) {
        if (k < 0 || k > places.length - 1) {
            throw new IllegalArgumentException(String.format(ILLEGAL_ARGUMENT_EXCEPTION_MESSAGE, places.length, k));
        }

        for (int i = 0; i < places.length; i++) {
            if (places[k] == 0) {
                places[k] = 1;
                return true;
            }
            if (++k >= places.length) {
                k %= places.length;
            }
        }
        return false;

    }

    public boolean depart(int k) {
        if (k < 0 || k > places.length - 1) {
            throw new IllegalArgumentException(String.format(ILLEGAL_ARGUMENT_EXCEPTION_MESSAGE, places.length, k));
        }
        if (places[k] == 1) {
            places[k] = 0;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.print(StringManipulator.convertArrayToString(places, ""));
    }
}
