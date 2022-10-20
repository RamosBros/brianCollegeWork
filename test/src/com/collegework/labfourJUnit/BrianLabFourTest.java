package src.com.collegework.labfourJUnit;

import com.collegework.labfour.StringPractice;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BrianLabFourTest extends StringPractice {
    @Test
    void testIsPunct() {
        assertTrue(StringPractice.isPunctuation('.'));
        assertTrue(StringPractice.isPunctuation(';'));
        assertTrue(StringPractice.isPunctuation('?'));
        assertTrue(StringPractice.isPunctuation('\''));
        assertTrue(StringPractice.isPunctuation(','));
        assertTrue(StringPractice.isPunctuation(':'));
        assertTrue(StringPractice.isPunctuation('!'));
        assertFalse(StringPractice.isPunctuation(' '));
        assertFalse(StringPractice.isPunctuation('_'));
        assertFalse(StringPractice.isPunctuation('a'));
        assertFalse(StringPractice.isPunctuation('\t'));
        assertFalse(StringPractice.isPunctuation('\n'));
    }

    @Test
    void testNumPunct() {
        assertEquals(StringPractice.numPunct("cheesy poofs"), 0);
        assertEquals(StringPractice.numPunct(""), 0);
        assertEquals(StringPractice.numPunct("!"), 1);
        assertEquals(StringPractice.numPunct("! "), 1);
        assertEquals(StringPractice.numPunct("! "), 1);
        assertEquals(StringPractice.numPunct(" !"), 1);
        assertEquals(StringPractice.numPunct(".!"), 2);
        assertEquals(StringPractice.numPunct(". !"), 2);
        assertEquals(StringPractice.numPunct("There's always money in the banana stand."), 2);
    }

    @Test
    void testNumPunctStringInt() {
        assertEquals(StringPractice.numPunct("cheesy poofs", 4), 0);
        assertEquals(StringPractice.numPunct("", 1), 0);
        assertEquals(StringPractice.numPunct("!", 0), 1);
        assertEquals(StringPractice.numPunct("!", 1), 0);
        assertEquals(StringPractice.numPunct("! ", 1), 0);
        assertEquals(StringPractice.numPunct("! ", 0), 1);
        assertEquals(StringPractice.numPunct(" !", 0), 1);
        assertEquals(StringPractice.numPunct(".!", 0), 2);
        assertEquals(StringPractice.numPunct(".!", 1), 1);
        assertEquals(StringPractice.numPunct(".!", 2), 0);
        assertEquals(StringPractice.numPunct(". !", 0), 2);
        assertEquals(StringPractice.numPunct(". !", 1), 1);
        assertEquals(StringPractice.numPunct(". !", 2), 1);
        assertEquals(StringPractice.numPunct(". !", 3), 0);
        assertEquals(StringPractice.numPunct("There's always money in the banana stand.", 5), 2);
        assertEquals(StringPractice.numPunct("There's always money in the banana stand.", 6), 1);
    }

    @Test
    void testIndexOfFirstPunctString() {
        assertEquals(StringPractice.indexOfFirstPunct("cheesy poofs"), -1);
        assertEquals(StringPractice.indexOfFirstPunct(""), -1);
        assertEquals(StringPractice.indexOfFirstPunct("!"), 0);
        assertEquals(StringPractice.indexOfFirstPunct(" !"), 1);
        assertEquals(StringPractice.indexOfFirstPunct(". !"), 0);
        assertEquals(StringPractice.indexOfFirstPunct("There's always money in the banana stand."), 5);
    }


    @Test
    void testIndexOfFirstPunctStringInt() {
        assertEquals(StringPractice.indexOfFirstPunct("cheesy poofs", 4), -1);
        assertEquals(StringPractice.indexOfFirstPunct("cheesy poofs", 0), -1);
        assertEquals(StringPractice.indexOfFirstPunct("", 1), -1);
        assertEquals(StringPractice.indexOfFirstPunct("!", 0), 0);
        assertEquals(StringPractice.indexOfFirstPunct("!", 1), -1);
        assertEquals(StringPractice.indexOfFirstPunct("! ", 1), -1);
        assertEquals(StringPractice.indexOfFirstPunct("! ", 0), 0);
        assertEquals(StringPractice.indexOfFirstPunct("! ", 1), -1);
        assertEquals(StringPractice.indexOfFirstPunct("! ", 2), -1);
        assertEquals(StringPractice.indexOfFirstPunct(" !", 0), 1);
        assertEquals(StringPractice.indexOfFirstPunct(".!", 0), 0);
        assertEquals(StringPractice.indexOfFirstPunct(".!", 1), 1);
        assertEquals(StringPractice.indexOfFirstPunct(".!", 2), -1);
        assertEquals(StringPractice.indexOfFirstPunct(". !", 0), 0);
        assertEquals(StringPractice.indexOfFirstPunct(". !", 1), 2);
        assertEquals(StringPractice.indexOfFirstPunct(". !", 2), 2);
        assertEquals(StringPractice.indexOfFirstPunct(". !", 3), -1);
        assertEquals(StringPractice.indexOfFirstPunct("There's always money in the banana stand.", 0), 5);
        assertEquals(StringPractice.indexOfFirstPunct("There's always money in the banana stand.", 5), 5);
        assertEquals(StringPractice.indexOfFirstPunct("There's always money in the banana stand.", 6), 40);
    }

    @Test
    void testIndexOfLastPunct() {
        assertEquals(StringPractice.indexOfLastPunct("cheesy poofs"), -1);
        assertEquals(StringPractice.indexOfLastPunct(""), -1);
        assertEquals(StringPractice.indexOfLastPunct("!"), 0);
        assertEquals(StringPractice.indexOfLastPunct(" !"), 1);
        assertEquals(StringPractice.indexOfLastPunct(". !"), 2);
        assertEquals(StringPractice.indexOfLastPunct("There's always money in the banana stand."), 40);
    }

    @Test
    void testSubstitute() {
        assertEquals(StringPractice.substitute("apple", 'a', 'A'), "Apple");
        assertEquals(StringPractice.substitute("apple", 'a', 'a'), "apple");
        assertEquals(StringPractice.substitute("apple", ' ', 'a'), "apple");
        assertEquals(StringPractice.substitute("apple", 'a', ' '), " pple");
        assertEquals(StringPractice.substitute("apple", 'e', 'E'), "applE");
        assertEquals(StringPractice.substitute("apple", ' ', 'e'), "apple");
        assertEquals(StringPractice.substitute("apple", 'e', ' '), "appl ");
        assertEquals(StringPractice.substitute("apple", 'p', ' '), "a  le");
    }

    @Test
    void testSubstitutePunct() {
        assertEquals(StringPractice.substitutePunct("cheesy poofs"), "cheesy poofs");
        assertEquals(StringPractice.substitutePunct(""), "");
        assertEquals(StringPractice.substitutePunct("!"), " ");
        assertEquals(StringPractice.substitutePunct("! "), "  ");
        assertEquals(StringPractice.substitutePunct(" !"), "  ");
        assertEquals(StringPractice.substitutePunct(".!"), "  ");
        assertEquals(StringPractice.substitutePunct(". !"), "   ");
        assertEquals(StringPractice.substitutePunct("There's always money in the banana stand."),
                "There s always money in the banana stand ");
    }

    @Test
    void testWithoutPunct() {
        assertEquals(StringPractice.withoutPunct("cheesy poofs"), "cheesy poofs");
        assertEquals(StringPractice.withoutPunct(""), "");
        assertEquals(StringPractice.withoutPunct("!"), "");
        assertEquals(StringPractice.withoutPunct("! "), " ");
        assertEquals(StringPractice.withoutPunct(" !"), " ");
        assertEquals(StringPractice.withoutPunct(".!"), "");
        assertEquals(StringPractice.withoutPunct(". !"), " ");
        assertEquals(StringPractice.withoutPunct("There's always money in the banana stand."),
                "Theres always money in the banana stand");
    }

    @Test
    void testFoundIn() {
        assertFalse(StringPractice.foundIn("cheesy poofs", '.'));
        assertFalse(StringPractice.foundIn("cheesy poofs", 'q'));
        assertFalse(StringPractice.foundIn("", '.'));
        assertFalse(StringPractice.foundIn(" ", '.'));
        assertTrue(StringPractice.foundIn("cheesy poofs", 's'));
        assertTrue(StringPractice.foundIn("cheesy poofs", ' '));
        assertTrue(StringPractice.foundIn(" ", ' '));
    }

    @Test
    void testContainsNone() {
        assertTrue(StringPractice.containsNone("cheesy poofs", "aiuAEIOU"));
        assertFalse(StringPractice.containsNone("cheesy poofs", "abcde"));
        assertFalse(StringPractice.containsNone("cheesy poofs", "ABCDE "));
        assertTrue(StringPractice.containsNone("", "abcde "));
    }

    @Test
    void testOnlyPunct() {
        assertFalse(StringPractice.onlyPunct("!cheesy poofs"));
        assertFalse(StringPractice.onlyPunct("cheesy poofs"));
        assertFalse(StringPractice.onlyPunct("!,!?:,abc"));
        assertTrue(StringPractice.onlyPunct("!"));
        assertTrue(StringPractice.onlyPunct("!,!?:,"));
    }

    @Test
    void testNoPunct() {
        assertFalse(StringPractice.noPunct("!cheesy poofs"));
        assertFalse(StringPractice.noPunct("cheesy! poofs!"));
        assertFalse(StringPractice.noPunct("!,!?:,abc"));
        assertTrue(StringPractice.noPunct("Four score"));
        assertTrue(StringPractice.noPunct(" "));
        assertTrue(StringPractice.noPunct(""));
    }

    @Test
    void testconsecutivePuncts() {
        assertFalse(StringPractice.consecutivePuncts(""));
        assertFalse(StringPractice.consecutivePuncts("a"));
        assertFalse(StringPractice.consecutivePuncts("!"));
        assertFalse(StringPractice.consecutivePuncts("!a,"));
        assertTrue(StringPractice.consecutivePuncts("!,"));
        assertTrue(StringPractice.consecutivePuncts("a!,"));
        assertTrue(StringPractice.consecutivePuncts("a,!"));
        assertTrue(StringPractice.consecutivePuncts("aabb1.a.!"));
    }

}