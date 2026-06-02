/**
 * Converts an integer (1-3999) to a Roman numeral.
 * Time Complexity: O(1) — the number of iterations is bounded by a constant (13 value-symbol pairs).
 * Space Complexity: O(1) — fixed arrays and StringBuilder size proportional to Roman numeral length.
 */
public final class IntToRoman {
    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999 inclusive");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                sb.append(SYMBOLS[i]);
                num -= VALUES[i];
            }
        }
        return sb.toString();
    }
}