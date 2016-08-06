package test;

import core.Kata;

import static org.testng.Assert.*;

/**S
 * Created by Elmo on 7/30/2016.
 *
 */
public class KataTest {
    private static String[] numerals = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
            "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
            "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
            "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
            "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX"
    };

    @org.testng.annotations.Test
    public void testBasicConvertIntToNum() throws Exception {
        Kata kata;
        kata = new Kata();

        for (Integer i = 1; i < numerals.length - 1; i++)
        {
            assertEquals(kata.ConvertIntToNum(i), numerals[i - 1]);
        }
    }
}