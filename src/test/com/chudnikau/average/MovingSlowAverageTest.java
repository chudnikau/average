package com.chudnikau.average;

import org.junit.Assert;
import org.junit.Test;

public class MovingSlowAverageTest {

    @Test
    public void whenSizeIsOne() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(1);
        Assert.assertEquals(1.0, movingAverage.next(1), 0.0);
    }

    @Test
    public void whenSizeIsOneMultipleCall() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(1);
        movingAverage.next(1);
        Assert.assertEquals(2.0, movingAverage.next(2), 0.0);
    }

    @Test
    public void whenSizeIsTwo() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(2);
        movingAverage.next(1);
        Assert.assertEquals(5.5, movingAverage.next(10), 0.0);
    }

    @Test
    public void whenSizeIsTwoMultipleCall() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(2);
        movingAverage.next(1);
        movingAverage.next(10);
        Assert.assertEquals(7, movingAverage.next(4), 0.0);
    }

    @Test
    public void whenSizeLessSize() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(3);
        movingAverage.next(2);
        Assert.assertEquals(4, movingAverage.next(6), 0.0);
    }

    @Test
    public void whenSizeIsTree() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        Assert.assertEquals(4.666666666666667, movingAverage.next(3), 0.0);
    }

    @Test
    public void whenSizeIsTreeMultipleCall() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        movingAverage.next(3);
        Assert.assertEquals(6.0, movingAverage.next(5), 0.0);
    }

    @Test
    public void whenMultipleCall() {
        MovingSlowAverage movingAverage = new MovingSlowAverage(3);
        movingAverage.next(1);
        movingAverage.next(10);
        movingAverage.next(3);
        movingAverage.next(5);
        movingAverage.next(3);
        Assert.assertEquals(5.0, movingAverage.next(7), 0.0);
    }

}
