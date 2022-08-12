package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K3Square0dot18() {
        double expected = 0.18;
        int p = 2;
        double k = 3;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K3Square0dot75() {
        double expected = 0.75;
        int p = 4;
        double k = 3;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }
}