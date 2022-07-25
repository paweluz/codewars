package pl.pawlak.pawel.codewars.kata.romannumerals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class RomanNumerals {

    static final Map<Integer, String> number2Roman = new LinkedHashMap<>();
    static Map<String, Integer> roman2Number;

    static {
        number2Roman.put(4000, "MMMM");
        number2Roman.put(3000, "MMM");
        number2Roman.put(2000, "MM");
        number2Roman.put(1000, "M");
        number2Roman.put(900, "CM");
        number2Roman.put(800, "DCCC");
        number2Roman.put(700, "DCC");
        number2Roman.put(600, "DC");
        number2Roman.put(500, "D");
        number2Roman.put(400, "CD");
        number2Roman.put(300, "CCC");
        number2Roman.put(200, "CC");
        number2Roman.put(100, "C");
        number2Roman.put(90, "XC");
        number2Roman.put(80, "LXXX");
        number2Roman.put(70, "LXX");
        number2Roman.put(60, "LX");
        number2Roman.put(50, "L");
        number2Roman.put(40, "XL");
        number2Roman.put(30, "XXX");
        number2Roman.put(20, "XX");
        number2Roman.put(10, "X");
        number2Roman.put(9, "IX");
        number2Roman.put(8, "VIII");
        number2Roman.put(7, "VII");
        number2Roman.put(6, "VI");
        number2Roman.put(5, "V");
        number2Roman.put(4, "IV");
        number2Roman.put(3, "III");
        number2Roman.put(2, "II");
        number2Roman.put(1, "I");

        roman2Number = number2Roman.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

    }


    public static String toRoman(int n) {
        final StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : number2Roman.entrySet()) {
            int value = n - entry.getKey();
            if (value >= 0) {
                result.append(entry.getValue());
                n = value;
            }
        }
        return result.toString();
    }


    public static int fromRoman(String romanNumeral) {
        int result = 0;
        int valueToAddInCurrentStep = 0;
        final StringBuilder currentValue = new StringBuilder();
        for (int i = 0; i < romanNumeral.length(); i++) {
            currentValue.append(romanNumeral.charAt(i));
            if (roman2Number.get(currentValue.toString()) == null) {
                currentValue.setLength(0);
                result += valueToAddInCurrentStep;
                valueToAddInCurrentStep = 0;
                i = i - 1;
            } else {
                valueToAddInCurrentStep = roman2Number.get(currentValue.toString());
            }
        }
        return result + valueToAddInCurrentStep;
    }
}
