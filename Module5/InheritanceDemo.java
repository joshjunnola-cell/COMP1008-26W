import java.util.Scanner;
 
 
/*
    Module 5 Activity: Inheritance with CommissionEmployee
    Build an Employee superclass and extend it with CommissionEmployee
    and BasePlusCommissionEmployee.
*/
 
 
// STEP 1: Define the Employee superclass
abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
 
    // Constructor
    public Employee(String first, String last, String ssn) {
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
 
    // Getters
    // TODO: add getFirstName(), getLastName(), getSocialSecurityNumber()
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecutiryNumbe() { return socialSecurityNumber; }
 
    // earnings method placeholder
    public abstract double earnings();
 
 
    @Override
    public String toString() {
        // TODO: return formatted "first last\nssn: ###"
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecutiryNumbe());
    }
}
 
 
// STEP 2: Define CommissionEmployee as a subclass
class CommissionEmployee extends Employee {
    private double grossSales;        // weekly sales
    private double commissionRate;    // percentage
 
 
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn);
        // TODO: set grossSales and commissionRate with validation
        setGrossSales(sales);
        setCommissionRate(rate);
    }
 
    // TODO: getters and setters for grossSales and commissionRate
    public void setGrossSales(double sales) {
        if(sales < 0.0) throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
        grossSales = sales;
    }

    public void setCommissionRate(double rate){
        if(rate <= 0.0 || rate >= 1.0) throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
        commissionRate = rate;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }
 
    @Override
    public double earnings() {
        // TODO: return grossSales * commissionRate
        return getCommissionRate() * getGrossSales();
    }
 
 
    @Override
    public String toString() {
        // TODO: include the super.toString() plus grossSales and commissionRate
        return String.format("%s%n%s: $%,.2f; %s: %.2f",
                "commission employee: " + super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
 
 
// STEP 3: Define BasePlusCommissionEmployee subclass
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  // additional weekly salary
 
 
    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        // TODO: validate and set baseSalary
        setBaseSalary(salary);
    }
 
 
    // TODO: getter and setter for baseSalary
    public void setBaseSalary(double salary){
        if(salary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        baseSalary = salary;
    }

    public double getBaseSalary() { return baseSalary; }
 
    @Override
    public double earnings() {
        // TODO: return baseSalary + super.earnings()
        return getBaseSalary() + super.earnings();
    }
 
 
    @Override
    public String toString() {
        // TODO: include "Base salary" and call super.toString()
        return String.format("base-salaried %s%n%s : $%,.2f",
                super.toString(), "base salary", getBaseSalary());
    }
}
 
 
// STEP 4: Main driver class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        // TODO: Create objects of CommissionEmployee and BasePlusCommissionEmployee
        CommissionEmployee ce = new CommissionEmployee(
            "Sue", "Jones", "333-33-3333", 10000, 0.4);
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "444-44-4444", 5500, 0.55, 350);
 
        // TODO: Print their earnings individually
        System.out.printf("%s%nearned: $%,.2f%n%n",
            ce.toString(), ce.earnings());
        System.out.printf("%s%nearned: $%,.2f%n",
            bpce.toString(), bpce.earnings());

        scanner.close();
    }
}
