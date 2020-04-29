package me.kpali.leetcode.medianOfTwoSortedArrays;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void findMedianSortedArrays1() {
        int[] nums1 = new int[2];
        nums1[0] = 1;
        nums1[1] = 3;
        int[] nums2 = new int[1];
        nums2[0] = 2;
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        double expected = 2.0;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = new int[2];
        nums1[0] = 1;
        nums1[1] = 2;
        int[] nums2 = new int[2];
        nums2[0] = 3;
        nums2[1] = 4;
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        double expected = 2.5;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = new int[0];
        int[] nums2 = new int[1];
        nums2[0] = 1;
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        double expected = 1.00000;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void findMedianSortedArrays4() {
        int[] nums1 = new int[1];
        nums1[0] = 3;
        int[] nums2 = new int[2];
        nums2[0] = -2;
        nums2[1] = -1;
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        double expected = -1.00000;
        Assert.assertEquals(expected, actual, 0);
    }
}