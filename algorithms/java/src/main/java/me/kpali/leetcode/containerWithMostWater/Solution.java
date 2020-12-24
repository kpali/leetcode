package me.kpali.leetcode.containerWithMostWater;

public class Solution {
    /**
     * !!! Has better solution: Two Pointer Approach
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int left = 0; left < height.length - 1; left++) {
            int topIndexOnRight = -1;
            for (int right = left + 1; right < height.length; right++) {
                if (topIndexOnRight == -1 || height[right] > height[topIndexOnRight]) {
                    topIndexOnRight = right;
                }
            }
            for (int right = topIndexOnRight; right < height.length; right++) {
                int h = height[left] < height[right] ? height[left] : height[right];
                int v = right - left;
                int area = v * h;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
