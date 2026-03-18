import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

// Test suite for all classes
public class BigTestSuite {


    // Calculator tests
    Calculator calc = new Calculator();


    @Test
    public void testAdd() {
        assertEquals(10, calc.add(3, 4));

    }


    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(6, 4));

    }


    @Test
    public void testMultiply() {
        assertEquals(10, calc.multiply(5, 2));
    }


    @Test
    public void testDivide() {
        assertEquals(1, calc.divide(4, 2));
    }


    // Exception test (division by zero)
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {

            calc.divide(10, 0);
        });
    }


    // StringUtility tests
    StringUtility strUtil = new StringUtility();


    @Test
    public void testReverse() {
        assertEquals("OLLEH", strUtil.reverse("HELLO"));

    }


    @Test
    public void testPalindromeTrue() {
        assertTrue(strUtil.isPalindrome("madam"));

    }


    @Test
    public void testPalindromeFalse() {

        assertFalse(strUtil.isPalindrome("hello"));
    }


    // BankAccount tests
    @Test
    public void testDeposit() {


        BankAccount acc = new BankAccount("John", 500);
        acc.deposit(200);
        assertEquals(700, acc.getBalance(), 0.001);


    }


    @Test
    public void testWithdraw() {


        BankAccount acc = new BankAccount("John", 500);
        acc.withdraw(200);
        assertEquals(300, acc.getBalance(), 0.001);

    }


    // Exception test: withdraw more than balance
    @Test
    public void testWithdrawTooMuch() {
        assertThrows(ArithmeticException.class, () -> {
            BankAccount acc = new BankAccount("John", 500);
            acc.withdraw(600);
        });
    }

    // Exception test: negative deposit
    @Test
    public void testNegativeDeposit() {
        assertThrows(ArithmeticException.class, () -> {
            BankAccount acc = new BankAccount("John", 500);
            acc.deposit(-100);
        });
    }
}