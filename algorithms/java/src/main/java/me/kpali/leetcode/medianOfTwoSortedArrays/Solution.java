package me.kpali.leetcode.medianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Double median1 = null;
        if (nums1.length == 1) {
            median1 = (double) nums1[0];
        } else if (nums1.length > 1) {
            median1 = (nums1[0] + nums1[nums1.length - 1]) / 2d;
        }

        Double median2 = null;
        if (nums2.length == 1) {
            median2 = (double) nums2[0];
        } else if (nums2.length > 1) {
            median2 = (nums2[0] + nums2[nums2.length - 1]) / 2d;
        }

        if (median1 != null && median2 != null) {
            return (median1 + median2) / 2;
        } else if (median1 != null) {
            return median1;
        } else if (median2 != null) {
            return median2;
        } else {
            return 0;
        }
    }
}
