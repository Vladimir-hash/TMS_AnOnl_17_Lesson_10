package task3;

/*
       3. Дана строка произвольной длины с произвольными словами.
 Найти слово, в котором число различных символов минимально. Слово
 может содержать буквы и цифры. Если таких слов несколько, найти первое
 из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
 быть "fffff".
*/

import java.util.HashSet;
import java.util.Set;

public class Task3 {
        public static void iAmTired(String str) {
            int minSizeWord = Integer.MAX_VALUE;
            String minWord = "";

            String[] newStr = str
                    .trim()
                    .replaceAll("[, . ? - ! ; : ]+", " ")
                    .replaceAll("[\s]+", " ")
                    .split(" ");

            for (String word : newStr) {
                Set<Character> charactersOfWord = new HashSet<>();
                for (int i = 0; i < word.length(); i++) {
                    charactersOfWord.add(word.charAt(i));
                }

                if (charactersOfWord.size() < minSizeWord) {
                    minSizeWord = charactersOfWord.size();
                    minWord = word;
                }
            }
            System.out.println("The min size word  - " + minWord);
    }
}
