package task1;

/*
    1. Написать программу со следующим функционалом:
 На вход передать строку (будем считать, что это номер документа).
 Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
 а y — это буква.
 - Вывести на экран в одну строку два первых блока по 4 цифры.
 - Вывести на экран номер документа, но блоки из трех букв заменить
 на *** (каждая буква заменятся на *).
 - Вывести на экран только одни буквы из номера документа в
 формате yyy/yyy/y/y в нижнем регистре.
 - Вывести на экран буквы из номера документа в формате
 "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
 класса StringBuilder).
 Все эти методы реализовать в отдельном классе в статических методах,
 которые на вход (входным параметром) будут принимать вводимую на
 вход программы строку.
 */

public class StringTask {
    public static String printDocumentNumb(String number) {
      return number.substring(0,4) + number.substring(9,13);
    }
    public static StringBuilder printDocNumb(String number) {
        StringBuilder stringBuilder = new StringBuilder(number);
        stringBuilder.replace(5,8, "***")
                     .replace(14,17, "***");
        return stringBuilder;
    }
    public static void printOnlyAlphabet(String number) {
        String result = number
                        .replaceAll("[0-9 -]+", "/")
                        .toLowerCase();
        System.out.println(result);
    }
    public static void printCamelCase (String number) {
        String result = number
                .replaceAll("[0-9 -]+", "/")
                .toUpperCase();
        StringBuilder stringBuilder = new StringBuilder("Letters: ").append(result);
        System.out.println(stringBuilder);
    }

}
