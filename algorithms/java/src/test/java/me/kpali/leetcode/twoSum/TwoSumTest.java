package me.kpali.leetcode.twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    private TwoSum twoSum = new TwoSum();
    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] results = twoSum.twoSum(nums, target);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}