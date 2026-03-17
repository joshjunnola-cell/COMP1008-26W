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
 
 
public class Rock {
 
 
    // STEP 0: Enum for Game Choices
    enum Choice {
        ROCK, PAPER, SCISSORS
    }
 
    // STEP 1: Create a method to greet the user
    public static void greetUser() {
        System.out.println("Hello Everyone! Welcome to Week 3 Methods Demo.");
    }
 
    // STEP 2: Create a method to add two numbers and return the sum
    public static int addNumbers(int a, int b) { 
        return a + b;
    }
 
    // STEP 3: Create a method to multiply two numbers and return the product
    public static int multiplyNumbers(int x, int y) {
        return x * y;
    }
 
    // STEP 4: Create a method to check if number is positive and even using logical operators
    public static boolean isPositiveAndEven(int n) {
        return (n > 0) && (n % 2 == 0);
    }
 
    // STEP 5: Create overloaded methods to display info
    public static void displayInfo() {
        System.out.println("Display Info: No information provided.");
    }
    
    public static void displayInfo(String name) {
        System.out.println("Display Info: Name: " + name);
    }
    
    public static void displayInfo(String name, int age) {
        System.out.println("Display Info: Name: " + name + ", Age: " + age);
    }
 
    // STEP 6: Method that uses enum (simulate game choice)
    public static void showChoice(String player, Choice choice) {
        System.out.println(player + " chooses " + choice);
    }
 
 
    // STEP 7: Create a method that calls other methods (for method call stack demo)
    public static int sumAndMultiply(int a, int b) {
        int sum = addNumbers (a, b);
        int product = multiplyNumbers (a, b);
        return sum + product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        System.out.println("==== Week 3: Methods, Logical Operators & Enums Demo ====");
 
 
        // STEP 1: Call a method to greet the user
        // Example: greetUser();
        greetUser();
 
 
        // STEP 2: Call a method that adds two numbers and returns the sum
        // Example: addNumbers(?, ?);
        int sum = addNumbers(77, 19);
        System.out.println("Sum of 77 and 19 is: " + sum);
 
        // STEP 3: Call a method that multiplies two numbers and returns the product
        // Example: multiplyNumbers(?, ?);
        int product = multiplyNumbers(19, 17);
        System.out.println("Product of 19 and 17 is: " + product);
 
        // STEP 4: Call a method that checks if a number is positive and even using logical operators
        // Example: isPositiveAndEven(?);

        boolean check = isPositiveAndEven(12);
        System.out.println("Is 12 positive and even? " + check);
 
        // STEP 5: Call overloaded methods (same name, different parameters)
        // Example: displayInfo();
        // Example: displayInfo("John");
        // Example: displayInfo("John", 25);
 
        displayInfo();
        displayInfo("Josh");
        displayInfo("John", 24);
 
        // STEP 6: Enum usage demo
        // Example: Choice userChoice = Choice.ROCK;
        // Example: Choice computerChoice = Choice.SCISSORS;
        
        Choice userChoice = Choice.ROCK;
        Choice computerChoice = Choice.SCISSORS;
        showChoice("Player", userChoice);
        showChoice("Computer", computerChoice);
 
        // STEP 7: Method call stack demo by calling other methods
        // Example: sumAndMultiply(?, ?);
 
        int result = sumAndMultiply(3, 5);
        System.out.println("Sum and Multiply result = " + result);
        
 
        scanner.close();
    }
}
