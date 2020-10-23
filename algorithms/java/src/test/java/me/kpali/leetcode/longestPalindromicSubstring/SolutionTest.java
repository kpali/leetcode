package me.kpali.leetcode.longestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void longestPalindromicSubstring1() {
        String input = "babad";
        String actual = solution.longestPalindrome(input);

        String expected =  "bab";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromicSubstring2() {
        String input = "cbbd";
        String actual = solution.longestPalindrome(input);

        String expected =  "bb";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromicSubstring3() {
        String input = "a";
        String actual = solution.longestPalindrome(input);

        String expected =  "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromicSubstring4() {
        String input = "ac";
        String actual = solution.longestPalindrome(input);

        String expected =  "a";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromicSubstring5() {
        String input = "aacabdkacaa";
        String actual = solution.longestPalindrome(input);

        String expected =  "aca";
        Assert.assertEquals(expected, actual);
    }
}