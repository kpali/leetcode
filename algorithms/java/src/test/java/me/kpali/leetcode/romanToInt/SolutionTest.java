package me.kpali.leetcode.romanToInt;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int expected = 3;
        int actual = solution.romanToInt("III");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int expected = 4;
        int actual = solution.romanToInt("IV");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int expected = 9;
        int actual = solution.romanToInt("IX");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int expected = 58;
        int actual = solution.romanToInt("LVIII");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        int expected = 1994;
        int actual = solution.romanToInt("MCMXCIV");
        Assert.assertEquals(expected, actual);
    }
}
