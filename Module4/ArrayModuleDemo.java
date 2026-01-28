import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
 
 
/*
    Module 4 Activity: Arrays and ArrayList
    Topics Covered:
    - Declaring and creating arrays
    - Initializing arrays
    - Passing arrays to methods
    - Enhanced for loop
    - Exception handling with arrays
    - Multidimensional arrays
    - Variable-length arguments
    - ArrayList introduction
*/
 
 
 
 
// STEP 1: Utility class for array operations
class ArrayUtilities {
 
 
    // Method to calculate sum of array elements
    public static int sumArray(int[] numbers) {
        // TODO: use loop to calculate sum
        return 0;
    }
 
 
    // Method to find average
    public static double averageArray(int[] numbers) {
        // TODO: call sumArray and compute average
        return 0.0;
    }
 
 
    // Variable-length argument method
    public static int maxValue(int... values) {
        // TODO: find maximum value
        return 0;
    }
}
 
 
 
 
// STEP 2: Class to demonstrate 2D arrays
class GradeBook {
 
 
    private int[][] grades;
 
 
    // Constructor
    public GradeBook(int[][] gradesArray) {
        // TODO: assign grades
    }
 
 
    // Display grades
    public void displayGrades() {
        // TODO: nested loop to print 2D array
    }
 
 
    // Calculate average for each student
    public void calculateAverages() {
        // TODO: loop through rows and compute averages
    }
}
 
 
 
 
// STEP 3: Main driver class
public class ArrayModuleDemo {
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // -----------------------------
        // PART 1: One-Dimensional Arrays
        // -----------------------------
 
 
        // TODO: Declare and create an int array of size 5
        int[] numbers = new int[5];
 
 
        // TODO: Populate array using Scanner
        // Hint: use for loop
 
 
 
 
        // TODO: Display array using enhanced for loop
 
 
 
 
        // TODO: Call sumArray and averageArray methods
 
 
 
 
        // -----------------------------
        // PART 2: Exception Handling
        // -----------------------------
 
 
        try {
            // TODO: Access an invalid index to demonstrate exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: print exception message
        }
 
 
 
 
        // -----------------------------
        // PART 3: Multidimensional Arrays
        // -----------------------------
 
 
        int[][] studentGrades = {
            {85, 90, 78},
            {88, 76, 92},
            {70, 68, 75}
        };
 
 
        // TODO: Create GradeBook object
        // TODO: Display grades
        // TODO: Calculate averages
 
 
 
 
        // -----------------------------
        // PART 4: ArrayList Introduction
        // -----------------------------
 
 
        ArrayList<String> names = new ArrayList<>();
 
 
        // TODO: Add 3 student names
        // TODO: Display names using enhanced for loop
        // TODO: Remove one name
        // TODO: Display updated list
 
 
 
 
        // -----------------------------
        // PART 5: Varargs Method Call
        // -----------------------------
 
 
        // TODO: Call maxValue with multiple arguments
        // Example: maxValue(10, 20, 5, 40, 15)
 
 
        scanner.close();
    }
}
