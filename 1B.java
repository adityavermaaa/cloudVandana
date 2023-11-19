import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> romanNumerals = new HashMap<>();

    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }

    public static int romanToInt(String roman) {
        int result = 0;
        int prevValue = 0;

        for (char c : roman.toCharArray()) {
            int value = romanNumerals.get(c);

            if (value > prevValue) {
                result -= prevValue;
            }

            result += value;
            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int integer = romanToInt(roman);
        System.out.println("The integer equivalent of the Roman numeral '" + roman + "' is: " + integer);
    }
}
