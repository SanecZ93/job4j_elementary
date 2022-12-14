package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(second, first);
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(first, second, max(third, four));
    }
}
