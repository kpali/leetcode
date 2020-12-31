package me.kpali.leetcode.intToRoman;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Soluition soluition = new Soluition();

    @Test
    public void test1() {
        String expected = "III";
        String actual = soluition.intToRoman(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "IV";
        String actual = soluition.intToRoman(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String expected = "IX";
        String actual = soluition.intToRoman(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String expected = "LVIII";
        String actual = soluition.intToRoman(58);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String expected = "MCMXCIV";
        String actual = soluition.intToRoman(1994);
        Assert.assertEquals(expected, actual);
    }
}
