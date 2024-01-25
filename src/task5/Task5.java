package task5;

import static java.lang.String.valueOf;

/*
Дана произвольная строка.
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки.
Например, "Hello" -> "HHeelllloo"
 */

public class Task5 {
    public static void duplicate(String strs) {

        char[] array = strs.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : array) {
            stringBuilder.append(letter).append(letter);
        }
        String newString = valueOf(stringBuilder);
        System.out.println(newString);
    }

}
