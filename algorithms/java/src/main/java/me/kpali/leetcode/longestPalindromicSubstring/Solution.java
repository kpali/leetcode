package me.kpali.leetcode.longestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        // default value
        String longestPalindrome = String.valueOf(chars[0]);

        for (int startIndex = 0; startIndex < chars.length; startIndex++) {
            for (int endIndex = chars.length - 1; endIndex > startIndex; endIndex--) {
                if (chars[startIndex] == chars[endIndex]) {
                    // check palindrome
                    int length = endIndex - startIndex + 1;
                    String str = String.valueOf(chars, startIndex, length);
                    int halfLength = 0;
                    if (length % 2 != 0) {
                        // odd length
                        halfLength = (length - 1) / 2;
                    } else {
                        // even length
                        halfLength = length / 2;
                    }
                    boolean isPalindrome = true;
                    for (int i = 1; i < halfLength; i++) {
                        char leftChar = chars[startIndex + i];
                        char rightChar = chars[endIndex - i];
                        if (leftChar != rightChar) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome && str.length() > longestPalindrome.length()) {
                        longestPalindrome = str;
                    }
                }
            }
        }

        return longestPalindrome;
    }
}
