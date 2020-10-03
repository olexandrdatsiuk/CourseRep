package com.example.rd.java.basic.practice6.part3;

public class Part3 {

    public static void main(String[] args) {
        final int parkingCapacity = 2;
        Parking parking = new Parking(parkingCapacity);
        final int[] placesToArrive = {1, 1, 1};
        final int[] placesToDepart = {1, 1};

        for (int place : placesToArrive) {
            boolean isEmptyPlace = parking.arrive(place);
            parking.print();
            System.out.println(", " + isEmptyPlace);
        }

        for (int place : placesToDepart) {
            boolean wasCarAtPlace = parking.depart(place);
            parking.print();
            System.out.println(", " + wasCarAtPlace);
        }
    }

}
