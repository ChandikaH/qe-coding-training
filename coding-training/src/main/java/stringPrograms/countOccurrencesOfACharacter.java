package stringPrograms;

import java.util.Locale;

/**
 * @author chandikah
 * on 2022-04-18
 */
public class countOccurrencesOfACharacter {
    public static void main(String[] args) {
        countOccurrences("Today is Monday", 't');
        countOccurrencesForEach("Today is Monday", 'T');
    }

    public static void countOccurrences(String input, char character) {
        int charCount = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                charCount++;
            }
        }
        System.out.println("Count of Character " + character + " in given input = " + input + " : count : " + +charCount);
    }

    public static void countOccurrencesForEach(String input, char character) {
        int charCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch == character) {
                charCount++;
            }
        }
        System.out.println("Count of Character " + character + " in given input = " + input + " : count : " + +charCount);
    }
}
