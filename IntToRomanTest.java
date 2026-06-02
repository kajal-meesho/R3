import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {
    @Test void test1()        { assertEquals("I", IntToRoman.intToRoman(1)); }
    @Test void test4()        { assertEquals("IV", IntToRoman.intToRoman(4)); }
    @Test void test9()        { assertEquals("IX", IntToRoman.intToRoman(9)); }
    @Test void test40()       { assertEquals("XL", IntToRoman.intToRoman(40)); }
    @Test void test90()       { assertEquals("XC", IntToRoman.intToRoman(90)); }
    @Test void test400()      { assertEquals("CD", IntToRoman.intToRoman(400)); }
    @Test void test900()      { assertEquals("CM", IntToRoman.intToRoman(900)); }
    @Test void test1994()     { assertEquals("MCMXCIV", IntToRoman.intToRoman(1994)); }
    @Test void test3999()     { assertEquals("MMMCMXCIX", IntToRoman.intToRoman(3999)); }
    @Test void test58()       { assertEquals("LVIII", IntToRoman.intToRoman(58)); }
    @Test void test944()      { assertEquals("CMXLIV", IntToRoman.intToRoman(944)); }
    @Test void test2024()     { assertEquals("MMXXIV", IntToRoman.intToRoman(2024)); }
    @Test void testZero()     { assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman(0)); }
    @Test void testNegative() { assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman(-1)); }
    @Test void testTooBig()   { assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman(4000)); }
}