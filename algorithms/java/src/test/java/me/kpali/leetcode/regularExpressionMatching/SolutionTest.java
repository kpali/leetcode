package me.kpali.leetcode.regularExpressionMatching;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "aa";
        String p = "a";
        Assert.assertFalse(solution.isMatch(s, p));
    }

    @Test
    public void test2() {
        String s = "aa";
        String p = "a*";
        Assert.assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void test3() {
        String s = "ab";
        String p = ".*";
        Assert.assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void test4() {
        String s = "aab";
        String p = "c*a*b";
        Assert.assertTrue(solution.isMatch(s, p));
    }

    @Test
    public void test5() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        Assert.assertFalse(solution.isMatch(s, p));
    }

    @Test
    public void test6() {
        String s = "mississippi";
        String p = "mis*is*ip*.";
        Assert.assertTrue(solution.isMatch(s, p));
    }
}
