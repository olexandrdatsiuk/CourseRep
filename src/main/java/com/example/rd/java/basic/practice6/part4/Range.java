package com.example.rd.java.basic.practice6.part4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

public class Range implements Iterable<Integer> {

    private int[] numbers;
    private final Supplier<Iterator<Integer>> iteratorSupplier;

    public Range(int n, int m) {
        this(n, m, false);
    }

    public Range(int firstBound, int secBound, boolean reverseOrder) {
        generateNumbers(firstBound, secBound);
        iteratorSupplier = reverseOrder ? ReverseIterator::new : ConsistentIterator::new;
    }

    private void generateNumbers(int firstBound, int secBound) {
        if (firstBound > secBound) {
            throw new IllegalArgumentException("firstBound should be less than secBound");
        }
        numbers = new int[secBound - firstBound + 1];
        for (int i = 0, k = firstBound; i < numbers.length; i++, k++) {
            numbers[i] = k;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return iteratorSupplier.get();
    }

    private final class ConsistentIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return numbers[index++];
        }

    }

    private final class ReverseIterator implements Iterator<Integer> {

        private int index = numbers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return numbers[index--];
        }

    }

}


