package me.kpali.leetcode.stringToInteger;

public class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean hasMinusSign  = false;
        boolean hasPostiveSign  = false;
        boolean startWithZero = false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (sb.length() == 0 && startWithZero) {
                    break;
                } else if (sb.length() == 0 && !hasMinusSign && !hasPostiveSign) {
                    if (c == '-') {
                        hasMinusSign = true;
                        sb.append("-");
                    } else if (c == '+') {
                        hasPostiveSign = true;
                    } else if (c != ' ') {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                if (startWithZero && hasMinusSign) {
                    return 0;
                }
                if (sb.length() == 0 && c == '0') {
                    startWithZero = true;
                    continue;
                } else if (sb.length() == 1 && hasMinusSign && c == '0') {
                    continue;
                }
                sb.append(c);
            }
        }
        if (sb.length() == 1 && hasMinusSign) {
            return 0;
        } else if (sb.length() > 11 && hasMinusSign) {
            return Integer.MIN_VALUE;
        } else if (sb.length() > 10 && !hasMinusSign) {
            return Integer.MAX_VALUE;
        }
        long l = ((sb.length() == 0) ? 0L : Long.parseLong(sb.toString()));
        if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) l;
        }
    }
}
