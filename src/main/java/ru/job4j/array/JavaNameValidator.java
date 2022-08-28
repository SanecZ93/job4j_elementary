package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {

        for (int i = 0; i < name.length(); i++) {
         if (isSpecialSymbol(i) || isLowerLatinLetter(i)
         || isUpperLatinLetter(i));

        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {

        }
            return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 || code <= 90) {

        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 || code <= 122) {

        }
        return false;
    }
}

