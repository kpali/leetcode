package me.kpali.leetcode.threeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = solution.threeSum(nums);
        Assert.assertEquals(2, list.size());
        for (List<Integer> childList : list) {
            Assert.assertEquals(3, childList.size());
            Assert.assertEquals(0, childList.get(0) + childList.get(1) + childList.get(2));
        }
    }

    @Test
    public void test2() {
        int[] nums = new int[0];
        List<List<Integer>> list = solution.threeSum(nums);
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0};
        List<List<Integer>> list = solution.threeSum(nums);
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void test4() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> list = solution.threeSum(nums);
        Assert.assertEquals(1, list.size());
    }
}
