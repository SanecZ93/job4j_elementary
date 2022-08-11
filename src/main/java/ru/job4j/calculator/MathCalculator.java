package ru.job4j.calculator;

import static ru.job4j.condition.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndFunction(double first, double second) {
        return  sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return   dif(first, second)
                 + div(first, second);
    }

    public static double total(double first, double second) {
        return  sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndFunction(10, 20));
        System.out.println("Результат расчёта равен: " + difAndDiv(10, 20));
        System.out.println("Результат расчёта равен: " + total(10, 20));

    }
}