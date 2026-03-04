package Module7.ExamPractice;

class Employee {
    public void displayInfo() {
        System.out.println("This is a generic employee");
    }
}

class HourlyEmployee extends Employee {
    public void displayInfo() {
        System.out.println("This is an hourly employee");
    }

    public void calculateHourlyWage() {
        System.out.println("Calculating hourly wages");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        //Upcast: create a new HourlyEmployee object and refer to it with a reference
        Employee emp = new HourlyEmployee();

        performSafeDowncasting(emp);

        Employee anotherEmp = new Employee();
        performSafeDowncasting(anotherEmp);
    }

    public static void performSafeDowncasting(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            HourlyEmployee hrEmp = (HourlyEmployee) employee;
            System.out.println("Downcasting Success");

            hrEmp.calculateHourlyWage();
        }else{
            System.out.println("Cannot downcast to HourlyEmployee");
        }
        System.out.println();
    }
}