package me.kpali.leetcode.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char c = ' ';
            for (String str : strs) {
                c = (str.length() <= i || (c != ' ' && c != str.charAt(i))) ? ' ' : str.charAt(i);
                if (c == ' ') {
                    break;
                }
            }
            if (c == ' ') {
                break;
            }
            sb.append(c);
            i++;
        }
        return sb.toString();
    }
}
