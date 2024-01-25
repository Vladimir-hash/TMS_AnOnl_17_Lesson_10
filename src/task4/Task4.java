package task4;

/*
    4. Дана строка произвольной длины с произвольными словами.
Написать программу для проверки является ли любое выбранное слово в
строке палиндромом.
Например, есть строка, вводится число 3, значит необходимо проверить
является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных
ситуаций: например, в строке 5 слов, а на вход программе передали число
500 и т. п. ситуации.
 */

import java.util.Scanner;

public class Task4 {
        public static void checkPalindrome(String str, int num) {
            String[] words = str.split(" ");

            if (num <= 0 || num > words.length) {
                throw new IllegalArgumentException("Error");
            }

            String word = words[num - 1];
            if (word.contentEquals(new StringBuilder(word).reverse())) {
                System.out.println("Word " + word.toUpperCase() + " is palindrome");
            } else {
                System.out.println("Word " + word.toUpperCase() + " isn't palindrome");
            }
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String str = "deed nun level bossy";
            System.out.println("Full sentence: \n" + str);

            try {
                System.out.print("Input number - ");
                int position = scanner.nextInt();
                checkPalindrome(str, position);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

