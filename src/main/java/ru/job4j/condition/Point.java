package ru.job4j.condition;

import ru.job4j.MathFunc;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double func1 = x2 - x1;
        double func2 = y2 - y1;
        double exp1 = Math.pow(func1, 2);
        double exp2 = Math.pow(func2, 2);
        double sum = exp1 + exp2;
        double sqr = Math.sqrt(sum);
        return sqr;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
