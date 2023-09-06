import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyScanner {
    public static String myScanner() {
        Scanner scannerMyText = new Scanner(System.in);
        System.out.println("Введите выражение:");
        return scannerMyText.nextLine();
    }

}


