package me.kpali.leetcode.palindromeNumber;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void isPalindrome1() {
        int input = 121;
        boolean actual = solution.isPalindrome(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindrome2() {
        int input = -121;
        boolean actual = solution.isPalindrome(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void isPalindrome3() {
        int input = 10;
        boolean actual = solution.isPalindrome(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void isPalindrome4() {
        int input = -101;
        boolean actual = solution.isPalindrome(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void isPalindrome5() {
        int input = 9999;
        boolean actual = solution.isPalindrome(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindrome6() {
        int input = 2147483647;
        boolean actual = solution.isPalindrome(input);
        Assert.assertFalse(actual);
    }
}
