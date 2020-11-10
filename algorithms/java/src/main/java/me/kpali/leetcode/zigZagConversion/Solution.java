package me.kpali.leetcode.zigZagConversion;

public class Solution {
    public String convert(String s, int numRows) {
        /**
         * P A Y P A L I S H I R I N G
         * 1       2       3       4
         *   5   6   7   8   9   10  11
         *     12      13     14
         *
         * P   A   H   N
         * A P L S I I G
         * Y   I   R
         */

        /**
         * P A Y P A L I S H I R I N G
         * 1           2           3
         *   4       5   6       7   8
         *     9   10      11  12
         *       13          14
         *
         * P     I    N
         * A   L S  I G
         * Y A   H R
         * P     I
         */

        char[] inputChars = s.toCharArray();
        char[] outputChars = new char[inputChars.length];
        int outputIndex = 0;
        int zigZagSteps = numRows - 1;
        for (int row = 0; row < numRows; row++) {
            int offsets = row;
            while (offsets < inputChars.length) {
                outputChars[outputIndex] = inputChars[offsets];
                outputIndex++;
                if (zigZagSteps == 0) {
                    offsets++;
                } else if (Math.ceil(offsets / zigZagSteps) % 2 != 0) {
                    // odd, up
                    offsets += (zigZagSteps * 2) - ((zigZagSteps - row) * 2);
                } else {
                    // even, down
                    offsets += (zigZagSteps * 2) - (row * 2);
                }
            }
        }
        return String.valueOf(outputChars);
    }
}
