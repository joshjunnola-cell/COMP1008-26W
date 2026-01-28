import java.util.ArrayList;
import java.util.Scanner;
 
 
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
        int arraySum = 0;
        int arrayLength = numbers.length; 
        for(int i = 0; i < arrayLength; i++){
            arraySum += numbers[i]; 
        }
        return arraySum;
    }
 
 
    // Method to find average
    public static double averageArray(int[] numbers) {
        // TODO: call sumArray and compute average
        int arraySum = sumArray(numbers);
        return (double)arraySum /numbers.length;
    }
 
 
    // Variable-length argument method
    public static int maxValue(int... values) { // ... (VarArgs) means and unspecified/variable amount of args
        // TODO: find maximum value
        int arrayMax = 0;
        for (int value : values){
            if(value > arrayMax){
                arrayMax = value;
            }
        }
        return arrayMax;
    }
}
 
 
 
 
// STEP 2: Class to demonstrate 2D arrays
class GradeBook {
 
 
    private int[][] grades;
 
 
    // Constructor
    public GradeBook(int[][] gradesArray) {
        // TODO: assign grades
        this.grades = gradesArray;
    }
 
 
    // Display grades
    public void displayGrades() {
        // TODO: nested loop to print 2D array
        System.out.println("\nStudent Grades: ");
        for(int i=0; i<grades.length; i++){
            System.out.print("Student:" + (i + 1) + ":");
            for(int j=0; j<grades[i].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
 
 
    // Calculate average for each student
    public void calculateAverages() {
        // TODO: loop through rows and compute averages
        System.out.println("\nStudent Averages: ");
        for(int i=0; i<grades.length; i++){
            int sum = 0;
            for(int num : grades[i]){
                sum += num;
            }
            double avg = (double) sum/grades[i].length;
            System.out.println("Student" + (i+1) + "Average: " + avg);
        }
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
        
        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
 
 
        // TODO: Display array using enhanced for loop
 
        for (int number: numbers){
            System.out.println(number + " ");
        }
 
 
        // TODO: Call sumArray and averageArray methods
        
        System.out.println("Sum: " + ArrayUtilities.sumArray(numbers));
        System.out.println("Average: " + ArrayUtilities.averageArray(numbers));
 
 
        // -----------------------------
        // PART 2: Exception Handling
        // -----------------------------
 
 
        try {
            // TODO: Access an invalid index to demonstrate exception
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: print exception message
            System.out.println("\nException Caught" + e.getMessage());
        }
 
 
 
 
        // -----------------------------
        // PART 3: Multidimensional Arrays
        // -----------------------------
 
 
        int[][] studentGrades = {
            {85, 90, 78},  //Each row represents one student & each column represents each class
            {88, 76, 92},
            {70, 68, 75}
        };
 
 
        // TODO: Create GradeBook object
        GradeBook gb = new GradeBook(studentGrades);
        // TODO: Display grades
        gb.displayGrades();
        // TODO: Calculate averages
        gb.calculateAverages();
 
 
 
        // -----------------------------
        // PART 4: ArrayList Introduction
        // -----------------------------
 
 
        ArrayList<String> names = new ArrayList<>();
 
 
        // TODO: Add 3 student names
        names.add("Anthony");
        names.add("Tyler");
        names.add("Josh");

        // TODO: Display names using enhanced for loop
        System.out.println("\nStudent Names: ");
        for(String name: names){
            System.out.println(name);
        }

        // TODO: Remove one name
        names.remove("Tyler");

        // TODO: Display updated list
        System.out.println("\nUpdated Student Names: ");
        for(String name: names){
            System.out.println(name);
        } 
 
 
        // -----------------------------
        // PART 5: Varargs Method Call
        // -----------------------------
 
        // TODO: Call maxValue with multiple arguments
        // Example: maxValue(10, 20, 5, 40, 15)
        int max = ArrayUtilities.maxValue(10,20,5,6,15);
        System.out.println("\nMaximum Value: " + max);

 
 
        scanner.close();
    }
}