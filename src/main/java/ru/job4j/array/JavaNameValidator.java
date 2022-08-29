package ru.job4j.array;

import static com.sun.org.apache.xerces.internal.impl.dv.xs.TypeValidator.isDigit;
import static java.lang.Character.isUpperCase;
import static sun.util.locale.LocaleUtils.isEmpty;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        boolean valid = isEmpty(name) && isDigit(array[0]) && isUpperCase(array[0]);
        if (valid) {
            for (int i = 1; i < array.length; i++) {
                if (isSpecialSymbol(array[i]) || isLowerLatinLetter(array[i]) || isUpperLatinLetter(array[i])) {
                    valid = false;
                    break;
                }
            }
        }

        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        return false;
    }
}