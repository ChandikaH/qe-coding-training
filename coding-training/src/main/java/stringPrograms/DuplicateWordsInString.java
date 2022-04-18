package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chandikah
 * on 2022-04-18
 */
public class DuplicateWordsInString {
    public static void main(String[] args) {
        //removeDuplicatesFromString("javaTpoint is the best learning website");
        removeDuplicates("Hello is the best hello word in the word");
        duplicateWords("This sentence contains two words, one and two but one is unique");
    }

    public static void removeDuplicatesFromString(String input) {
        char[] str = input.toCharArray();
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index] = str[i];
                index++;
            }
        }
        System.out.println(Arrays.copyOf(str, index));
    }

    /**
     * Since a set only accepts unique elements, hence in each iteration the existence of the character is checked in the set.
     * If it does not exist, it is added to the set and the java.lang.StringBuilderobject which holds the final string without duplicate characters.
     * If the character exists in the set, loop continues and next character is tested.
     *
     * @param sentence
     */
    public static void removeDuplicates(String sentence) {
        try {
            if (sentence == null || sentence.isEmpty()) {
                throw new Exception("Enter valid input");
            }
            char[] characters = sentence.toCharArray();
            Set<Character> set = new HashSet<>();
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println("String with duplicates : " + sentence);
            for (char character : characters) {
                if (!set.contains(character)) {
                    set.add(character);
                    stringBuilder.append(character);
                }
            }
            System.out.println("String after duplicates removed : " + stringBuilder);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Method to find duplicate words in a Sentence or String * @param input String * @return set of duplicate words
     *
     * @return
     */
    public static Set<String> duplicateWords(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Duplicate Word count is null/empty or zero");
            return Collections.emptySet();
        }
        String[] words = input.split(" ");
        Set<String> duplicates = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (set.contains(word)) {
                duplicates.add(word);
            }
            set.add(word);
        }
        System.out.println("input : " + input);
        System.out.println("Duplicate Words : " + duplicates);
        return duplicates;
    }
}
