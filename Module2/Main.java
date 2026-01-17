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
            System.out.print(" " + count);
            count++;
        }
    }
 
    // Step 7.1: Do-While Loop

    void enterGPAs() {
        Scanner input = new Scanner(System.in);
        double gpaInput;
        do {
            System.out.print("Enter semester GPA - press -1 to stop.");
            gpaInput = input.nextDouble();

            if(gpaInput != -1) {
                System.out.println("Recorded GPA: " + gpaInput);
            }

        }while(gpaInput != -1);
        System.out.println("All semester GPAs recorded.");
    }
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
        for (int i = 1; i <= 5; i++) {
            System.out.print(id * i + " ");
        }
        System.out.println();
    }
 

    // Step 8.1 Enhanced For Loop: Used to loop through arrays or objections easily
    // Also called for-each loop

//for(dataType variable : arrayName) {}

    void printSemesterGPA() {
        double[] semesterGPA = {3.5, 3.7, 3.0};
        System.out.println("Semester GPAs:");
        for(double g : semesterGPA) {
            System.err.print(g + " ");
        }
        System.out.println();
    }
 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.err.println("Original GPA: " + gpa);
        gpa++;
        System.out.println("Updated GPA after increment: " + gpa);
        gpa += 0.5;
        System.out.println("Updated GPA after addition assignment: " + gpa);
        gpa--;
        System.out.println("Updated GPA after decrement: " + gpa);
        gpa -= 0.2;
        System.out.println("Updated GPA after subtraction assignment: " + gpa);
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
        s1.printMultiplesOfID();
        s1.printSemesterGPA();
        s1.enterGPAs();
        s1.updateGPA();
    }
}