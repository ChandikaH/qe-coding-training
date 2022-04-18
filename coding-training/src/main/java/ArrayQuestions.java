/**
 * @author chandikah
 * on 2022-03-23
 */
public class ArrayQuestions {
    public static void findWordOccurrences(String word, String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();
            if (word.equalsIgnoreCase(currentWord)) {
                count++;
                System.out.println(word + " " + words[i] + " = " + (i + 1) + "st/nd/th Word in the sentence");
            }
        }
        System.out.println(count + " occurrences");
    }
}
