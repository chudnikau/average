package com.chudnikau.average;

public class Main {
    public static void main(String[] args) {
        MovingFastAverage movingAverage = new MovingFastAverage(3);

        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}