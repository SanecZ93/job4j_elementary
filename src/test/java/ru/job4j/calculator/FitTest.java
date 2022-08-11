package ru.job4j.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman187Then80dot5() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        Assertions.assertEquals(expected, out, 0.01);
    }
}