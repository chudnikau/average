package com.chudnikau.average;

public class MovingFastAverage {

    int n = 0;

    int[] arr;

    int wSize;

    int sum = 0;

    public MovingFastAverage(int wSize) {
        this.wSize = wSize;
        arr = new int[this.wSize];
    }

    public double next(int value) {
        sum -= arr[0];
        System.arraycopy(arr, 1, arr, 0, wSize - 1);
        arr[wSize - 1] = value;
        sum += value;
        return (double) sum / Math.min(++n, wSize);
    }

}
