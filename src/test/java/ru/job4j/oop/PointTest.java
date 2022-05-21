package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        int expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test

    public void when22to22then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double dist = a.distance(b);
        int expected = 0;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test

    public void when11to10then1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        int expected = 1;
        Assert.assertEquals(expected, dist, 0.01);
    }
}
