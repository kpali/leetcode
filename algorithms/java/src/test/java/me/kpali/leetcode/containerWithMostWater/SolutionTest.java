package me.kpali.leetcode.containerWithMostWater;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = solution.maxArea(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] input = new int[]{1, 1};
        int expected = 1;
        int actual = solution.maxArea(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] input = new int[]{4, 3, 2, 1, 4};
        int expected = 16;
        int actual = solution.maxArea(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int[] input = new int[]{1, 2, 1};
        int expected = 2;
        int actual = solution.maxArea(input);
        Assert.assertEquals(expected, actual);
    }
}
