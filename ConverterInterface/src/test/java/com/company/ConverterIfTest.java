package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private ConverterIf converterIf;

    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
    }

    @Test
    public void shouldGiveWrittenMonthFromActualNumberedMonth() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("June", converterIf.convertMonth(6));
        assertEquals("December", converterIf.convertMonth(12));
    }

    @Test
    public void shouldGiveWrittenDayFromActualNumberedMonth() {
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Saturday", converterIf.convertDay(7));
    }

    @Test
    public void shouldGiveErrorIfInvalidNumberedMonth() {
        String errorMessagePositive = 15 + " does not correspond with a month! Try a number between 1 - 12";
        assertEquals(errorMessagePositive, converterIf.convertMonth(15));

        String errorMessageNegative = -8 + " does not correspond with a month! Try a number between 1 - 12";
        assertEquals(errorMessageNegative, converterIf.convertMonth(-8));
    }

    @Test
    public void shouldGiveErrorIfInvalidNumberedDay() {
        String errorMessagePositive = 15 + " does not correspond with a day! Try a number between 1 - 7";
        assertEquals(errorMessagePositive, converterIf.convertDay(15));

        String errorMessageNegative = -5 + " does not correspond with a day! Try a number between 1 - 7";
        assertEquals(errorMessageNegative, converterIf.convertDay(-5));
    }
}