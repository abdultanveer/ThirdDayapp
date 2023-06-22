package com.example.thirddayapp;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int expected = 40;
        int actual = Calculator.add(10,20);

        assertEquals(expected,actual);
    }

    public void testMultiply() {
        int expected = 20;
        int actual = Calculator.multiply(5,4);

        assertEquals(expected,actual);
    }
}