package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {

        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void testDivision() {

        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 5);

        assertEquals(2, result);
    }
}
