import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

// Test suite for all classes
public class BigTestSuite {


    // Calculator tests
    Calculator calc = new Calculator();


    @Test
    public void testAdd() {
        assertEquals(10,calc.add(3,4));

    }


    @Test
    public void testSubtract() {
        assertEquals(2,calc.subtract(6, 4));

    }


    @Test
    public void testMultiply() {
        assertEquals(10,calc.multiply(5,2));
    }


    @Test
    public void testDivide() {
        Assertions.assertEquals(1, calc.divide(4,2));
    }


    // Exception test (division by zero)
    @Test(expected = ArithmeticException.class)

    public void testDivideByZero(){

        calc.divide(10, 0);

    }


    // StringUtility tests
    StringUtility strUtil = new StringUtility();


    @Test
    public void testReverse() {
        Assertions.assertEquals("OLLEH", strUtil.reverse("HELLO"));

    }


    @Test
    public void testPalindromeTrue() {
        Assertions.assertTrue(strUtil.isPalindrome("madam"));

    }


    @Test
    public void testPalindromeFalse() {

        Assertions.assertFalse(strUtil.isPalindrome("hello"));
    }




    // BankAccount tests
    @Test
    public void testDeposit() {


        BankAccount acc = new BankAccount("John",500);
        acc.deposit(200);
        Assertions.assertEquals(700, acc.getBalance(), 0.001);


    }


    @Test
    public void testWithdraw() {


        BankAccount acc = new BankAccount("John",500);
        acc.withdraw(200);
        Assertions.assertEquals(300, acc.getBalance(), 0.001);

    }




    // Exception test: withdraw more than balance
    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawTooMuch() {
        BankAccount acc = new BankAccount("John", 500);
        acc.withdraw(600);
    }

    // Exception test: negative deposit
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeDeposit() {
        BankAccount acc = new BankAccount("John", 500);
        acc.deposit(-100);
    }
}