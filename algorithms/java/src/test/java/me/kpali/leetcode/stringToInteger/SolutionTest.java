package me.kpali.leetcode.stringToInteger;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void myAtoi1() {
        String input = "42";
        int expected = 42;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi2() {
        String input = "   -42";
        int expected = -42;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi3() {
        String input = "4193 with words";
        int expected = 4193;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi4() {
        String input = "words and 987";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi5() {
        String input = "-91283472332";
        int expected = -2147483648;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi6() {
        String input = "-+12";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi7() {
        String input = "+1";
        int expected = 1;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi8() {
        String input = "+-12";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi9() {
        String input = "20000000000000000000";
        int expected = 2147483647;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi10() {
        String input = "  0000000000012345678";
        int expected = 12345678;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi11() {
        String input = "00000-42a1234";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi12() {
        String input = "-000000000000001";
        int expected = -1;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi13() {
        String input = "2147483646";
        int expected = 2147483646;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi14() {
        String input = "-2147483647";
        int expected = -2147483647;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myAtoi15() {
        String input = "0  123";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }
}
