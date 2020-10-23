package me.kpali.leetcode.medianOfTwoSortedArrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // sort
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);

        if (nums3.length == 1) {
            return nums3[0];
        }
        Arrays.sort(nums3);

        if (nums3.length % 2 != 0) {
            // odd length
            return nums3[(nums3.length - 1) / 2];
        } else {
            // even length
            int halfLen = nums3.length / 2;
            int left = nums3[halfLen - 1];
            int right = nums3[halfLen];
            return (double)(left + right) / 2d;
        }
    }
}
