package Practice.Week1;

public class Student {

    //instance variables (private for incapsulation)
    private String name;
    private int gradeLevel;

    //constant (static final)
    private static final double MIN_GPA = 0.0;

    //constructor (same name as class!!)
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    //getter and setter (encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setter with validation
    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel < 1 || gradeLevel > 12) {
            System.out.println("Invalid grade");
        }else{
            this.gradeLevel = gradeLevel;
        }
    }

    //a void method
    public void displayInfo() {
        System.out.println(name + " is in grade " + gradeLevel);
    }

    //return-type method
    public int getGradeLevel() {
        return gradeLevel;
    }

    //checks if honor roll
    public boolean isHonorRoll(double gpa) {
        return gpa >= 3.5;
    }

    //static method
    public static void schoolInfo() {
        System.out.println("Welcome to Java School");
    }
}