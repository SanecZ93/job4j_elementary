package ru.job4j.calculator;

public class Calc {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = Calc.func1(100);
        int result2 = Calc.func2(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}
