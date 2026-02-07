package Labs.Lab3_Inheritance;
 
 
abstract class Employee {
 
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
    // TODO 1: Create a constructor
    public Employee(String first, String last, String ssn) {
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }

    // TODO 2: Create getters
    public String getfirstName() { return firstName; }
    public String getlastName() { return lastName; }
    public String getsocialSecurityNumber() { return socialSecurityNumber; }

    // TODO 3: Declare abstract method earnings()
    public abstract double earnings();
 
    // TODO 4: Override toString()
    @Override
    public String toString(){
        return String.format("%s %s%nSocial Security Number: %s",
            getfirstName(), getlastName(), getsocialSecurityNumber());
    }
}

class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    public CommissionEmployee(String first, String last, String ssn,
                             double sales, double rate){
    // TODO 5: Create constructor using super()
        super(first, last, ssn);

        setGrossSales(sales);
        setCommissionRate(rate);
    }
    // TODO 6: Create getters and setters with validation
    public void setGrossSales(double sales) {
        if(sales < 0.0) throw new IllegalArgumentException(
        "Gross Sales must be >= 0.0");
        grossSales = sales;
    }

    public void setCommissionRate(double rate){
        if(rate <= 0.0 || rate >= 1.0) throw new IllegalArgumentException(
        "Commission Rate must be > 0.0 or < 1.0");
        commissionRate = rate;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }


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
