package me.kpali.leetcode.palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0) {
            return false;
        }
        // length
        int length = 0;
        while (true) {
            length++;
            double pow = Math.pow(10, length);
            if (pow >= Integer.MAX_VALUE) {
                break;
            }
            if (x / (int) pow == 0) {
                break;
            }
        }
        // check palindrome
        while (true) {
            int left = x / (int) Math.pow(10, length - 1);
            int right = x % 10;
            if (left != right) {
                return false;
            }

            length -= 2;
            if (length < 2) {
                break;
            }
            // cut head
            x = x % (int) Math.pow(10, length + 1);
            // cut tail
            x = x / 10;
        }
        return true;
    }
}
