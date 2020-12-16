package me.kpali.leetcode.stringToInteger;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String input = "42";
        int expected = 42;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "   -42";
        int expected = -42;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "4193 with words";
        int expected = 4193;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = "words and 987";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String input = "-91283472332";
        int expected = -2147483648;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String input = "-+12";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "+1";
        int expected = 1;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        String input = "+-12";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        String input = "20000000000000000000";
        int expected = 2147483647;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        String input = "  0000000000012345678";
        int expected = 12345678;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        String input = "00000-42a1234";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        String input = "-000000000000001";
        int expected = -1;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        String input = "2147483646";
        int expected = 2147483646;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        String input = "-2147483647";
        int expected = -2147483647;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test15() {
        String input = "0  123";
        int expected = 0;
        int actual = solution.myAtoi(input);
        Assert.assertEquals(expected, actual);
    }
}
