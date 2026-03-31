package Practice.Week8;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        
    
    String sentence = "Java   is   fun";
    String[] words = sentence.split("\\s+");

    System.out.println(Arrays.toString(words));

    Pattern pattern = Pattern.compile("\\d+");

    Matcher matcher = pattern.matcher("Order number is 4567");

    while (matcher.find()) {
        System.out.println(matcher.group());
    }

    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher("ID: 45, Code: 789");
    while (m.find()) {
        System.out.println(m.group());
    }

    String[] parts = "Java\tis   fun".split("\\s+");
    System.out.println(Arrays.toString(parts));

    }  
}
