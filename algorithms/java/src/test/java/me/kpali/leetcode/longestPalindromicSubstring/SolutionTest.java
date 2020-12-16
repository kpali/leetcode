package me.kpali.leetcode.longestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String input = "babad";
        String actual = solution.longestPalindrome(input);

        String expected =  "bab";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String input = "cbbd";
        String actual = solution.longestPalindrome(input);

        String expected =  "bb";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String input = "a";
        String actual = solution.longestPalindrome(input);

        String expected =  "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String input = "ac";
        String actual = solution.longestPalindrome(input);

        String expected =  "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String input = "aacabdkacaa";
        String actual = solution.longestPalindrome(input);

        String expected =  "aca";
        Assert.assertEquals(expected, actual);
    }
}