package ru.job4j;

public class Converter {
    public static float euroToRuble(float value) {
        float rsl = 70 / value;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = 60 / value;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.euroToRuble(1);
        float dollar = Converter.dollarToRuble(1);
        System.out.println("1 dollars are " + dollar + " rubles");
        System.out.println("1 euro are " + euro + " rubles");

    }

}
