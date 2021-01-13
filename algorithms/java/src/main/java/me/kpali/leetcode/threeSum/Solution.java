package me.kpali.leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length >= 3) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    // skip duplicated
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // skip duplicated result
                        while (left < nums.length - 1 && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        // skip duplicated result
                        while (right - 1 >= 0 && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
