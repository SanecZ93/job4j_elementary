package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, String.valueOf(0.01));
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, String.valueOf(0.01));
    }

    @Test
    public void when20to20then0() {
        double expected = 0;
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assertions.assertEquals(expected, out, String.valueOf(0.01));
    }

    @Test
    public void when30to02to20then4dot12() {
        double expected = 4.12;
        Point a = new Point(3, 0, 2);
        Point b = new Point(0, 2, 0);
        double out = a.distance3d(b);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to50to03then5dot91() {
        double expected = 5.91;
        Point a = new Point(0, 5, 0);
        Point b = new Point(1, 0, 3);
        double out = a.distance3d(b);
        Assertions.assertEquals(expected, out, 0.01);
    }
}