package me.kpali.leetcode.twoSum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return results;
    }
}
