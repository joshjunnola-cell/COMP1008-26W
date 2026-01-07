import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
   
 
    // Constant: minimum balance
     
    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
   
 
    
    // Set Methods (Mutators)
    
  
    // Get Methods (Accessors)
    
    // Display Info
    
    // Method with parameter and return
    
  
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
 
 //normal method
    
}
 
 
class SavingsAccount extends AccountBase {
    
}
 
 
// INTERFACE EXAMPLE
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       
        // 1. Creating Account Objects
               
        // 2. Using Set/Get Methods
      
        // 3. Primitive vs Reference Types
        
        // 4. Constants
      
        // 5. Methods with Parameters & Return Values
        
        // 6. Abstract Class
       
        // 7. Interface
        
        // 8. Scanner Example (Optional User Input)
       
    }
}