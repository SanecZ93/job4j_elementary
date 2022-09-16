package ru.job4j.condition;

public class Max {
    public static int maxTwo(int first, int second) {
        return Math.max(second, first);
    }

    public static int maxThree(int first, int second, int third) {
        return maxTwo(first, maxTwo(second, third));
    }

    public static int maxFour(int first, int second, int third, int four) {
        return maxThree(first, second, maxTwo(third, four));
    }
}
