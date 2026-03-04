package Module8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAndRegexLab {
 
 
    public static void main(String[] args) {
 
 
        // =====================================================
        // ================= PART 1 ============================
        // Strings, StringBuilder, Character, Tokenizing
        // =====================================================
 
 
        // STEP 1: Create a String called message
        // Assign value: "Java Programming Language"
        String message = "Java Programming language";
 
        // STEP 2: Print length of message
        System.out.println("Length: " + message.length());
 
 
        // STEP 3: Print character at index 5
        System.out.println("Character at index 5: " + message.charAt(5));
 
 
        // STEP 4: Extract substring "Programming"
        String sub = message.substring(5, 16);
        System.out.println("Substring: " + sub);
 
        // STEP 5: Compare two strings using equals()
        String another = "Java Programming language";
        System.err.println("Are Equal? " + message.equals(another));
 
 
        // STEP 6: Convert message to uppercase
        System.out.println("Uppercase: " + message.toUpperCase());
 
 
        // STEP 7: Use StringBuilder
        // Create StringBuilder with "Hello"
        // Append " Java"
        // Insert "Awesome " at beginning
        // Reverse it
        // Print result
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        sb.insert(0,"Awesome");
        sb.reverse();
        System.out.println("String Builder result: " + sb);
 
 
        // STEP 8: Use Character class
        // Create char variable
        // Check isDigit, isLetter, isUpperCase
        char ch = 'A';
        System.out.println("Is Digit? " + Character.isDigit(ch));
        System.out.println("Is Letter? " + Character.isLetter(ch));
        System.out.println("Is UpperCase? " + Character.isUpperCase(ch));
 
 
        // STEP 9: Tokenize this string:
        // "Apple,Banana,Mango"
        // Split by comma and print each fruit
        String fruits = "Apple,Banana,Mango";
        String[] tokens = fruits.split(",");
        for(String fruit : tokens) {
            System.out.println("Fruit: " + fruit);
        }
 
 
        // =====================================================
        // ================= PART 2 ============================
        // Regular Expressions (Pattern & Matcher)
        // =====================================================
 
 
        // STEP 10: Validate Email using regex
        // Create a String email = "student@email.com"
        String email = "student@gmail.com";
        // Write regex to validate simple email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
        // Print if valid or not
        if(email.matches(emailRegex)){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
 
 
        // STEP 11: Replace digits in a string
        // Example: "Java123"
        String replaceExample = "Java123";
        // Replace all digits with "*"
        String replaced = replaceExample.replaceAll("\\d", "*");
        System.out.println("Result: " + replaced);
 
 
        // STEP 12: Extract all numbers from string
        // Example: "Order number is 4567"
        // Use Pattern and Matcher
        String text = "Order number is 4567";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        // Print matched number
        while(matcher.find()){
            System.out.println("FoundNumber: " + matcher.group());
        }
 
 
 
        // STEP 13: Check if string contains only letters
        // Example: "JavaOnly"
        // Print true/false
        String lettersOnly = "JavaOnly";
        System.out.println("Only Letters? " + lettersOnly.matches("[A-Za-z]+"));
        
 
        // STEP 14: Split sentence using regex
        // Sentence: "Java   is   powerful"
        String sentence = "Java   is   powerful";
        // Split by multiple spaces
        String[] words = sentence.split("\\s+");
        // Print each word
        for(String word : words){
            System.out.println("Word: " + word);
        }
 
 
    }
}