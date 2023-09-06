import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetSign {
    public static String getSign(String input) {
        Pattern pattern = Pattern.compile(Main.REGEX);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()){
            return matcher.group();
        }else {
            throw new RuntimeException();
        }
    }

}
