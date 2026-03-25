package Practice.Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter grade level: ");
        int grade = scanner.nextInt();

        Student s = new Student(name, grade);      

        System.out.println("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        if (s.isHonorRoll(gpa)) {
            System.out.println("You made honor roll!");
        }else{
            System.out.println("Keep working hard");
        }

        s.displayInfo();
        s.schoolInfo();
    }
}
