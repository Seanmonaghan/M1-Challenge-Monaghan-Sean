package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsTest {

    Calculations calculations;

    @Before
    public void setUp() throws Exception {
        calculations = new Calculations();
    }

//    Testing Integer Calculations

    @Test
    public void shouldAddTwoIntegers() {
        assertEquals(6, calculations.add(2, 4));
    }

    @Test
    public void shouldSubtractTwoIntegers() {
        assertEquals(2, calculations.subtract(5, 3));
    }

    @Test
    public void shouldMultiplyTwoIntegers() {
        assertEquals(18, calculations.multiply(6, 3));
    }

    @Test
    public void shouldDivideTwoIntegers() {
        assertEquals(2, calculations.divide(6, 3));
    }


//    Testing Double Calculations


    @Test
    public void shouldAddTwoDoubles() {
        assertEquals(10.00, calculations.add(5.50, 4.50), 0.000001);
    }

    @Test
    public void shouldSubtractTwoDoubles() {
        assertEquals(10.00, calculations.subtract(15.10, 5.10), 0.000001);
    }

    @Test
    public void shouldMultipleTwoDoubles() {
        assertEquals(12.9315, calculations.multiply(5.55, 2.33), 0.000001);
    }

    @Test
    public void shouldDivideTwoDoubles() {
        assertEquals(7.47583643, calculations.divide(40.22, 5.38), 0.000001);
    }


//  Testing for Arithmetic Exceptions caused by dividing by 0

    @Test(expected = ArithmeticException.class)
    public void shouldCauseArithmeticExceptionByDividingByZero() {
        calculations.divide(5,0);
        calculations.divide(56.450, 0.000);
    }

}