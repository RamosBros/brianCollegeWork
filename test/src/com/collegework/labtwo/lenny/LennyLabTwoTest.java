package src.com.collegework.labtwo.lenny;

import com.collegework.labtwo.lenny.LennyLabTwo;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Here is a base example on how to test
 * <p>
 * poke around and experiment
 */
public class LennyLabTwoTest {

    LennyLabTwo lennyLabTwo = new LennyLabTwo(System.in);


    @Test
    public void checkPershultbeatsKlyket() {
        boolean userWin = lennyLabTwo.checkWinner("pershult", "klyket");
        assertTrue(userWin);
    }

    @Test
    public void checkPershultLoseTjusig() {
        boolean userWin = lennyLabTwo.checkWinner("pershult", "tjusig");
        assertFalse(userWin);
    }
}