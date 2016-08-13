package core;

import javafx.util.Pair;

import java.util.Objects;

/**
 * Created by Elmo on 7/30/2016.
 */
public class Kata {
    private Pair<Integer, String>[] values = new Pair[] {
        new Pair("M", 1000),
        new Pair("D", 500),
        new Pair("C", 100),
        new Pair("L", 50),
        new Pair("X", 10),
        new Pair("V", 5),
        new Pair("I", 1)
    };

    private Pair<String, Integer>[] digits = new Pair[] {
        new Pair("M", 1000),
        new Pair("CM", 900),
        new Pair("D", 500),
        new Pair("CD", 400),
        new Pair("C", 100),
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

    public Integer ConvertNumToInt(String numeral) {
        // reverse the string to read "right-to-left"
        StringBuilder sb = new StringBuilder(numeral);
        sb.reverse();
        String _numeral = sb.toString();

        Integer _hwm = 0;
        Integer _integer = 0;

        for (int sdx = 0; sdx < _numeral.length(); sdx++)
        {
            for (Pair value : values)
            {
                if (Objects.equals((String) value.getKey(), _numeral.substring(sdx, sdx + 1))) {
                    // set the high-water mark when higher value is found
                    if (_hwm <= (Integer) value.getValue()) {
                        _hwm = (Integer) value.getValue();
                        _integer += (Integer) value.getValue();
                    }

                    // numeral values under the high-water mark subtract from total value
                    if (_hwm > (Integer) value.getValue()) {
                        _integer -= (Integer) value.getValue();
                    }
                }
            }
        }

        return _integer;
    }
}