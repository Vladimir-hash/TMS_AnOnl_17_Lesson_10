package task2;
/*
      2. Дана строка произвольной длины с произвольными словами.
 Найти самое короткое слово в строке и вывести его на экран.
 Найти самое длинное слово в строке и вывести его на экран.
 Если таких слов несколько, то вывести последнее из них.

*/
public class Task2 {
    public static void plusMinus(String str) {

        String[] sentence = str
                .trim()
                .replaceAll("[, . ? - ! ; : ]+", " ")
                .replaceAll("[\s]+", " ")
                .split(" ");

        String shortestWord = sentence[0];
        String longestWord = sentence[0];

        for (String word : sentence) {
            if (word.length() <= shortestWord.length()) {
                shortestWord = word;
            }
             else if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The shortest word: " + shortestWord);
        System.out.println("The longest word: " + longestWord);
    }



}
