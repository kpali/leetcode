package me.kpali.leetcode.longestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void lengthOfLongestSubstring1() {
        String input = "abcabcbb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 3;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        String input = "bbbbb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 1;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 3;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        String input = " ";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 1;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring5() {
        String input = "au";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 2;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring6() {
        String input = "dvdf";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 3;
        Assert.assertEquals(expectd, actual);
    }

    @Test
    public void lengthOfLongestSubstring7() {
        String input = "aabaab!bb";
        int actual = solution.lengthOfLongestSubstring(input);

        int expectd = 3;
        Assert.assertEquals(expectd, actual);
    }
}