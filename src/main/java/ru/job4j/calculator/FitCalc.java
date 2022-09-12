package ru.job4j.calculator;

public class FitCalc {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = FitCalc.manWeight(height);
        double woman = FitCalc.womanWeight(height);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 180 is " + woman);
    }
}
