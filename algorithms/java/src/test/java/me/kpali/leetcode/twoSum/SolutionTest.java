package me.kpali.leetcode.twoSum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actuals = solution.twoSum(nums, target);

        int[] expecteds = {0, 1};
        Assert.assertArrayEquals(expecteds, actuals);
    }
}