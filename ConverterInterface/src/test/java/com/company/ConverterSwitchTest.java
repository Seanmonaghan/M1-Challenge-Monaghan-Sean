package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    private ConverterSwitch converterSwitch;

    @Before
    public void setUp() throws Exception {
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldGiveWrittenMonthFromActualNumberedMonth() {
        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("June", converterSwitch.convertMonth(6));
        assertEquals("December", converterSwitch.convertMonth(12));
    }

    @Test
    public void shouldGiveWrittenDayFromActualNumberedMonth() {
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Saturday", converterSwitch.convertDay(7));
    }

    @Test
    public void shouldGiveErrorIfInvalidNumberedMonth() {
        String errorMessagePositive = 15 + " does not correspond with a month! Try a number between 1 - 12";
        assertEquals(errorMessagePositive, converterSwitch.convertMonth(15));

        String errorMessageNegative = -8 + " does not correspond with a month! Try a number between 1 - 12";
        assertEquals(errorMessageNegative, converterSwitch.convertMonth(-8));
    }

    @Test
    public void shouldGiveErrorIfInvalidNumberedDay() {
        String errorMessagePositive = 15 + " does not correspond with a day! Try a number between 1 - 7";
        assertEquals(errorMessagePositive, converterSwitch.convertDay(15));

        String errorMessageNegative = -5 + " does not correspond with a day! Try a number between 1 - 7";
        assertEquals(errorMessageNegative, converterSwitch.convertDay(-5));
    }
}

