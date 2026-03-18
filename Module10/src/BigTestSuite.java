import static org.junit.Assert.*;
import org.junit.Test;


// Test suite for all classes
public class BigTestSuite {


    // Calculator tests
    Calculator calc = new Calculator();


    @Test
    public void testAdd() {

    }


    @Test
    public void testSubtract() {

    }


    @Test
    public void testMultiply() {

    }


    @Test
    public void testDivide() {

    }


    // Exception test (division by zero)




    // StringUtility tests
    StringUtility strUtil = new StringUtility();


    @Test
    public void testReverse() {

    }


    @Test
    public void testPalindromeTrue() {

    }


    @Test
    public void testPalindromeFalse() {

    }




    // BankAccount tests
    @Test
    public void testDeposit() {


        BankAccount acc = new BankAccount("John",500);
        acc.deposit(200);



    }


    @Test
    public void testWithdraw() {


        BankAccount acc = new BankAccount("John",500);
        acc.withdraw(200);



    }




    // Exception test: withdraw more than balance


}




// Exception test: negative deposit
   
 
 
    }
            }