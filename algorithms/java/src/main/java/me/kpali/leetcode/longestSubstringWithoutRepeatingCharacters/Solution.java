package me.kpali.leetcode.longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstringCount = 0;
        if (s != null) {
            char[] chars = s.toCharArray();
            if (chars.length == 1) {
                longestSubstringCount = 1;
            } else {
                List<Character> charList = new ArrayList<Character>();
                for (char c : chars) {
                    if (charList.contains(c)) {
                        int index = charList.indexOf(c);
                        List<Character> tempCharList = charList.subList(index + 1, charList.size());
                        charList = tempCharList;
                    }
                    charList.add(c);
                    if (charList.size() > longestSubstringCount) {
                        longestSubstringCount = charList.size();
                    }
                }
            }
        }
        return longestSubstringCount;
    }
}
