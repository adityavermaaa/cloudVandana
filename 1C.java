import java.util.*;

public class PangramChecker {

    public static boolean isPangram(String str) {
        // Create a Set to store encountered characters
        Set<Character> encounteredCharacters = new HashSet<>();

        // Convert the input string to lowercase
        str = str.toLowerCase();

        // Iterate through the lowercase string
        for (char ch : str.toCharArray()) {
            // Check if the character is an alphabet
            if (Character.isAlphabetic(ch)) {
                // Add the encountered character to the Set
                encounteredCharacters.add(ch);
            }
        }

        // Check if the Set contains all 26 alphabets
        return encounteredCharacters.size() == 26;
    }

    public static void main(String[] args) {
        String testString1 = "The quick brown fox jumps over the lazy dog";
        String testString2 = "The quick brown fox jumps over the lazy";
        String testString3 = "The quick brown fox jumps over the lazy cat";

        System.out.println(testString1 + " is " + (isPangram(testString1) ? "a pangram" : "not a pangram"));
        System.out.println(testString2 + " is " + (isPangram(testString2) ? "a pangram" : "not a pangram"));
        System.out.println(testString3 + " is " + (isPangram(testString3) ? "a pangram" : "not a pangram"));
    }
}
