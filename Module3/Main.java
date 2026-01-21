package Module3;

import java.util.Scanner;
 
 
/*
    Week 3 Comprehensive Program: Methods, Logical Operators & Enums
    Covers:
    - Static and instance methods
    - Methods with multiple parameters
    - Method overloading
    - Logical operators (&&, ||, !)
    - Method call stack and activation records
    - Using return values
    - Enum types
*/
 
 
public class Main {
 
 
    // STEP 0: Enum for Days (or Game Choices)
    enum Choice {
        ROCK, PAPER, SCISSORS
    }
 
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        System.out.println("==== Week 3: Methods, Logical Operators & Enums Demo ====");
 
 
        // STEP 1: Call a method to greet the user
        // Example: greetUser();
 
 
        // STEP 2: Call a method that adds two numbers and returns the sum
        // Example: addNumbers(?, ?);
 
 
        // STEP 3: Call a method that multiplies two numbers and returns the product
        // Example: multiplyNumbers(?, ?);
 
 
        // STEP 4: Call a method that checks if a number is positive and even using logical operators
        // Example: isPositiveAndEven(?);
 
 
        // STEP 5: Call overloaded methods (same name, different parameters)
        // Example: displayInfo();
        // Example: displayInfo("John");
        // Example: displayInfo("John", 25);
 
 
        // STEP 6: Enum usage demo
        // Example: Choice userChoice = Choice.ROCK;
        // Example: Choice computerChoice = Choice.SCISSORS;
 
 
        // STEP 7: Method call stack demo by calling other methods
        // Example: sumAndMultiply(?, ?);
 
 
        scanner.close();
    }
 
 
    // STEP 1: Create a method to greet the user
    // public static void greetUser() { ... }
 
 
    // STEP 2: Create a method to add two numbers and return the sum
    // public static int addNumbers(int a, int b) { ... }
 
 
    // STEP 3: Create a method to multiply two numbers and return the product
    // public static int multiplyNumbers(int x, int y) { ... }
 
 
    // STEP 4: Create a method to check if number is positive and even using logical operators
    // public static boolean isPositiveAndEven(int n) { ... }
 
 
    // STEP 5: Create overloaded methods to display info
    // public static void displayInfo() { ... }
    // public static void displayInfo(String name) { ... }
    // public static void displayInfo(String name, int age) { ... }
 
 
    // STEP 6: Method that uses enum (simulate game choice)
    // public static void showChoice(Choice choice) { ... }
 
 
    // STEP 7: Create a method that calls other methods (for method call stack demo)
    // public static int sumAndMultiply(int a, int b) { ... }
}
