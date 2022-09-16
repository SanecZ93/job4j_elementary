package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = Max.maxThree(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 5;
        int second = 10;
        int third = 1;
        int four = 4;
        int result = Max.maxFour(first, second, third, four);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}



