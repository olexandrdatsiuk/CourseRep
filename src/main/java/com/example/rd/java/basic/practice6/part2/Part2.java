package com.example.rd.java.basic.practice6.part2;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part2 {

    public static void main(String[] args) {
        final int start = 0;
        final int limit = 10_000;
        final int eachValue = 4;
        List<Integer> arrayListNumber;
        List<Integer> linkedListNumber;

        arrayListNumber = fillListWithIntegers(start, limit, ArrayList::new);
        System.out.println("ArrayList#Index: " + removeByIndex(arrayListNumber, eachValue) + " ms");

        linkedListNumber = fillListWithIntegers(start, limit, LinkedList::new);
        System.out.println("LinkedList#Index: " + removeByIndex(linkedListNumber, eachValue) + " ms");

        arrayListNumber = fillListWithIntegers(start, limit, ArrayList::new);
        System.out.println("ArrayList#Iterator: " + removeByIterator(arrayListNumber, eachValue) + " ms");

        linkedListNumber = fillListWithIntegers(start, limit, LinkedList::new);
        System.out.println("LinkedList#Iterator: " + removeByIterator(linkedListNumber, eachValue) + " ms");

    }

    private static List<Integer> fillListWithIntegers(int initValue, int limit, Supplier<List<Integer>> supplier) {
        return Stream.iterate(initValue, n -> ++n).limit(limit).collect(Collectors.toCollection(supplier));
    }

    public static long measureRunTimeInMillis(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - start;
    }

    public static long removeByIndex(final List<Integer> list, final int k) {
        return measureRunTimeInMillis(() -> {
            int shift = k - 1;
            int i;
            for (i = shift; list.size() > 1; ) {
                list.remove(i);
                i = ((i + shift) % list.size());
            }
        });
    }

    public static long removeByIterator(final List<Integer> list, int k) {
        return measureRunTimeInMillis(() -> {
            int i = k - 1;
            int counter = 0;

            while (list.size() > 1) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    if (counter++ == i) {
                        it.remove();
                        i += k;
                    }
                }
            }
        });
    }
}
