package me.kpali.leetcode.longestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        String[] input = new String[]{"flower", "flow", "flight"};
        String actual = solution.longestCommonPrefix(input);
        Assert.assertEquals("fl", actual);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"dog", "racecar", "car"};
        String actual = solution.longestCommonPrefix(input);
        Assert.assertEquals("", actual);
    }

    @Test
    public void test3() {
        String[] input = new String[]{"ab", "a"};
        String actual = solution.longestCommonPrefix(input);
        Assert.assertEquals("a", actual);
    }
}
