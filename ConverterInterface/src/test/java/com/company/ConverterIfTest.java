package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private ConverterIf converterIf

    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
    }

    @Test
    public void shouldGiveWrittenMonthFromActualNumberedMonth() {
        assertEquals("January", converterIf.convertMonth(1));
    }
}