package me.kpali.leetcode.zigZagConversion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void convert1() {
        String actual = solution.convert("PAYPALISHIRING", 3);

        /**
         * P   A   H   N
         * A P L S I I G
         * Y   I   R
         */
        String expected = "PAHNAPLSIIGYIR";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convert2() {
        String actual = solution.convert("PAYPALISHIRING", 4);

        /**
         * P    I     N
         * A  L S   I G
         * Y A  H R
         * P    I
         */
        String expected = "PINALSIGYAHRPI";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convert3() {
        String actual = solution.convert("A", 1);

        String expected = "A";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convert4() {
        String actual = solution.convert("AB", 1);

        String expected = "AB";
        Assert.assertEquals(expected, actual);
    }
}