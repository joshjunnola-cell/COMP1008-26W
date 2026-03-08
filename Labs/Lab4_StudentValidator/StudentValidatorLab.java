package Labs.Lab4_StudentValidator;

import java.util.*;
 
 
public class StudentValidatorLab {
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================
 
 
        // STEP 1:
        // Ask user to enter full name
        System.out.println("Please enter full name: ");
        String userName = scanner.nextLine();
 
 
        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()
        if (userName.matches("^[A-Za-z ]+$")) {
            System.out.println("Valid name entered!");
        } else {
            System.out.println("Invalid name. Only letters and spaces allowed.");
        }
 
 
 
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================
 
 
        // STEP 3:
        // Ask user to enter student ID
        System.out.println("Enter your student ID: ");
        String studentID = scanner.nextLine();
 
 
        // STEP 4:
        // Validate format using regex
        if (studentID.matches("^S-\\d{4}$")) {
            System.out.println("Valid student ID.");
        }else {
            System.out.println("Invalid ID. Format must be S-1234");
        }
 
 
 
        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================
 
 
        // STEP 5:
        // Ask user to enter email
        System.out.println("Enter your email.");
        String studentEmail = scanner.nextLine();
 
 
        // STEP 6:
        // Validate email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
        if(studentEmail.matches(emailRegex)){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
 
 
        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================
 
 
        // STEP 7:
        // Ask user to enter a sentence
        System.out.println("Enter a random sentence: ");
        String sentence = scanner.nextLine();
 
 
        // STEP 8:
        // Count vowels using Character class
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
        
            ch = Character.toLowerCase(ch);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }

        }

        System.out.println("Number of vowels: " + vowelCount);
        // STEP 9:
        // Reverse sentence using StringBuilder
        StringBuilder sb = new StringBuilder(sentence);
        String reversed = sb.reverse().toString();
 
        System.out.println("Reversed sentence: " + reversed);
 
        // STEP 10:
        // Replace all digits in sentence with '*'
        String replaced = sentence.replaceAll("\\d", "*");
        System.out.println("Replaced digits: " + replaced);
 
 
 
        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================
 
 
        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course
 
 
 
 
        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================
 
 
        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers
 
 
 
 
        scanner.close();
    }
}