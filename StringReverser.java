public final class StringReverser {

    private StringReverser() {}

    /**
     * Reverses the input string preserving Unicode surrogate pairs.
     *
     * @param s the input string
     * @return the reversed string
     * @throws IllegalArgumentException if s is null
     */
    public static String reverse(String s) {
        if (s == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        int[] codePoints = s.codePoints().toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = codePoints.length - 1; i >= 0; i--) {
            sb.appendCodePoint(codePoints[i]);
        }
        return sb.toString();
    }

    /**
     * Checks if a string is a palindrome (case‑sensitive).
     *
     * @param s the input string
     * @return true if s equals its reverse
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        return s.equals(reverse(s));
    }

    /**
     * Reverses the order of words in the string.
     * Words are separated by whitespace; leading/trailing spaces are trimmed
     * and multiple spaces are collapsed to one.
     *
     * @param s the input string
     * @return the string with words reversed
     * @throws IllegalArgumentException if s is null
     */
    public static String reverseWords(String s) {
        if (s == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] words = trimmed.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(' ');
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println("reverse(\"hello\") = " + reverse("hello"));
        System.out.println("isPalindrome(\"racecar\") = " + isPalindrome("racecar"));
        System.out.println("reverseWords(\"hello world\") = " + reverseWords("hello world"));
    }
}