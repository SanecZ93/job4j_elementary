package ru.job4j.condition;

public class Compare {
    public static int max(int left, int right) {

        return Math.max(left, right);
    }

    public static void main(String[] args) {
     int rsl = Compare.max(1, 2);
     System.out.println(rsl);
    }
}
