package me.kpali.leetcode.longestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void test1() {
        String input = "abcabcbb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "bbbbb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "pwwkew";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = " ";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String input = "au";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        String input = "dvdf";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        String input = "aabaab!bb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}