package me.kpali.leetcode.reverseInteger;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void reverse1() {
        int input = 123;
        int expected = 321;
        int actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse2() {
        int input = -123;
        int expected = -321;
        int actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse3() {
        int input = 120;
        int expected = 21;
        int actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse4() {
        int input = 0;
        int expected = 0;
        int actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse5() {
        int input = 1534236469;
        int expected = 0;
        int actual = solution.reverse(input);
        Assert.assertEquals(expected, actual);
    }
}
