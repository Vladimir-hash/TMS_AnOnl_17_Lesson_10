import task1.StringTask;
import task2.Task2;
import task3.Task3;
import task4.Task4;
import task5.Task5;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String number = "1234-aBc-5687-deF-9g0j";
        System.out.println(StringTask.printDocumentNumb(number));
        System.out.println(StringTask.printDocNumb(number));
        StringTask.printOnlyAlphabet(number);
        StringTask.printCamelCase(number);


        Task2.plusMinus("Woher kommst du?");
        Task3.iAmTired("fffff ab f 1234 jkjk");
        Task4.checkPalindrome("deed nun level bossy", 2);
        Task5.duplicate("bossy");
    }
}