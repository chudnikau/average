package com.chudnikau.average;

import java.util.LinkedList;
import java.util.Queue;

public class MovingSlowAverage {

    int wSize;

    Queue<Integer> queue;

    public MovingSlowAverage(int wSize) {
        this.wSize = wSize;
        queue = new LinkedList<>();
    }

    public double next(int value) {

        if (queue.size() >= wSize) {
            queue.poll();
        }
        queue.add(value);

        int s = 0;

        for (Integer v : queue) {
            s += v;
        }

        return (double) s / queue.size();
    }

}
