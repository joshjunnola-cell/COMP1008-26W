import java.util.Scanner;
 // Import Scanner for user input
 
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
 
 
class Student {
    // STEP 1: Declare instance variables
    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
 
    //Strings are reference types, int and double are primitive types

    // STEP 2: Declare a constant (final)
    final double MIN_GPA = 0;
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("\nStudent Information:");
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
        System.out.println("Program:" + program);
        System.out.println("Grade Level:" + gradeLevel);
        System.out.println("GPA:" + gpa);
    }
 
 
    // STEP 4: Conditional statements (if…else)
    void checkGPA() {
        // TODO: Use if…else to check GPA ranges
        if (gpa >= 3.5) {
            System.out.println(name + " is an Honor Student.");
        }else if(gpa >= 2.0) {
            System.out.println(name + " has a passing gpa.");
        }else{
            System.out.println(name + " needs to improve their gpa.");
        }
        }
    
 
 
    // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if(program.equalsIgnoreCase("Computer Science")) {
            if(gpa >= 3.5) {
                System.out.println(name + " is eligible for CS scholarship.");
            }else {
                System.out.println(name + " is not eligible for CS scholarship.");
            }
        }
    }
 
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        // TODO: Use switch to print school type based on gradeLevel
        switch(gradeLevel) {
            case 1: case 2: case 3:
            System.out.println(name + " is an elementary school.");
            break;
            case 4: case 5: case 6:
            System.out.println(name + " is in middle school.");
            break;
            case 7: case 8: case 9:
            System.out.println(name + " is in high school.");
            break;
            case 10: case 11: case 12:
            System.out.println(name + " is in college.");
            break;
            default:
            System.out.println("Invalid grade level.");

        }
    }
 
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;
        
        while(count <= (int)gpa) {
            System.out.print(count + " ");
            count++;
        }
    }
 
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
    }
 
 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
    }
}
 
 
 
// MAIN CLASS
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        Student s1 = new Student();
 
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "Josh";
        s1.id = 415;
        s1.program = "computer science";
        s1.gradeLevel = 5;
        s1.gpa = 4.2;
 
        // STEP 3: Call methods to practice all concepts
        s1.displayInfo();
        s1.checkGPA();
        s1.checkProgram();
        s1.gradeDescription();
        s1.printNumbersUpToGPA();
    }
}