import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("10|01", Pattern.CASE_INSENSITIVE);
    String str = "111*000";
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
      str = matcher.replaceAll("");
      matcher = pattern.matcher(str);
    }
    System.out.println(str.length());
  }
}
