package Labs.Lab3_Inheritance;
 
 
public abstract class Employee {
 
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
    // TODO 1: Create a constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }

    // TODO 2: Create getters
    public String getfirstName() { return firstName; }
    public String getlastName() { return lastName; }
    public String getsocialSecurityNumber() { return socialSecurityNumber; }
    
    // TODO 3: Declare abstract method earnings()
 
    // TODO 4: Override toString()
}

public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    // TODO 5: Create constructor using super()
 
    // TODO 6: Create getters and setters with validation
 
    // TODO 7: Override earnings()
 
    // TODO 8: Override toString()
}

public class PayrollTest {
 
    public static void main(String[] args) {
 
        // TODO 9: Create a CommissionEmployee object
 
        // TODO 10: Display employee details
 
        // TODO 11: Display earnings
    }
}
