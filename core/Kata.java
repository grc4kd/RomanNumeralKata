package core;

import javafx.util.Pair;

/**
 * Created by Elmo on 7/30/2016.
 */
public class Kata {
    private Pair<String, Integer>[] digits = new Pair[] {
        new Pair("XC", 90),
        new Pair("L", 50),
        new Pair("XL", 40),
        new Pair("X", 10),
        new Pair("IX", 9),
        new Pair("V", 5),
        new Pair("IV", 4),
        new Pair("I", 1)
    };

    public String ConvertIntToNum(Integer integer) {
        String _numeral = new String();

        for (Pair digit : digits) {
           while (integer >= (Integer)digit.getValue()) {
               _numeral += (String)digit.getKey();
               integer -= (Integer)digit.getValue();
           }
        }

        return _numeral;
    }
}