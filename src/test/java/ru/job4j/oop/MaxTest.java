package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = new Max().max(first, second);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = new Max().max(first, second, third);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 22;
        int result = new Max().max(first, second, third, fourth);
        int expected = 22;
        Assert.assertEquals(expected, result);
    }
}
