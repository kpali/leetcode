package me.kpali.leetcode.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<Character>();
        if (s != null) {
            char[] chars = s.toCharArray();
            if (chars.length == 1) {
                return 1;
            }
            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];
                charSet.add(c);
            }
        }
        return charSet.size();
    }
}
