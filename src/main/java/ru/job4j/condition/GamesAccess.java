package ru.job4j.condition;

public class GamesAccess {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        GamesAccess.permission(true, true);
        GamesAccess.permission(true, false);
        GamesAccess.permission(false, true);
        GamesAccess.permission(false, false);
    }
}
