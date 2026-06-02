public final class IntToRoman {
    // Time complexity: O(1) — fixed number of values-symbol pairs (13)
    // Space complexity: O(1) — only a few primitive/string variables
    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999 inclusive, got: " + n);
        }
        StringBuilder sb = new StringBuilder();
        int remainder = n;
        for (int i = 0; i < VALUES.length; i++) {
            while (remainder >= VALUES[i]) {
                sb.append(SYMBOLS[i]);
                remainder -= VALUES[i];
            }
        }
        return sb.toString();
    }
}