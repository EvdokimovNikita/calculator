import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final String REGEX = "\\+|-|\\*|/";

    public static void main(String[] args) {
        while (true) {
            CreateArrays createArrays = new CreateArrays();
            System.out.println(createArrays.createVariable());
        }
    }
}

