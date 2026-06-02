import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    // reverse tests
    @Test void reverseNormal() {
        assertEquals("olleh", StringReverser.reverse("hello"));
    }
    @Test void reverseEmpty() {
        assertEquals("", StringReverser.reverse(""));
    }
    @Test void reverseSingleChar() {
        assertEquals("a", StringReverser.reverse("a"));
    }
    @Test void reverseUnicode() {
        assertEquals("🍩abc", StringReverser.reverse("cba🍩"));
    }
    @Test void reverseNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> StringReverser.reverse(null));
    }

    // isPalindrome tests
    @Test void palindromeTrue() {
        assertTrue(StringReverser.isPalindrome("racecar"));
    }
    @Test void palindromeFalse() {
        assertFalse(StringReverser.isPalindrome("hello"));
    }
    @Test void palindromeEmpty() {
        assertTrue(StringReverser.isPalindrome(""));
    }
    @Test void palindromeSingleChar() {
        assertTrue(StringReverser.isPalindrome("a"));
    }
    @Test void palindromeCaseSensitive() {
        assertFalse(StringReverser.isPalindrome("Racecar"));
    }
    @Test void palindromeNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> StringReverser.isPalindrome(null));
    }

    // reverseWords tests
    @Test void reverseWordsNormal() {
        assertEquals("world hello", StringReverser.reverseWords("hello world"));
    }
    @Test void reverseWordsMultipleSpaces() {
        assertEquals("world hello", StringReverser.reverseWords("  hello   world  "));
    }
    @Test void reverseWordsSingleWord() {
        assertEquals("hello", StringReverser.reverseWords("hello"));
    }
    @Test void reverseWordsEmpty() {
        assertEquals("", StringReverser.reverseWords(""));
    }
    @Test void reverseWordsNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> StringReverser.reverseWords(null));
    }
}