package me.kpali.leetcode.twoSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    private TwoSum twoSum = new TwoSum();
    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actuals = twoSum.twoSum(nums, target);

        int[] expecteds = {0, 1};
        Assert.assertArrayEquals(expecteds, actuals);
    }
}