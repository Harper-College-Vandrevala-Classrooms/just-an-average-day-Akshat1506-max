package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    Calculator calculator;
    int[] testArray;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        testArray = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    void testMaximumUsingForLoop() {
        assertEquals(5, calculator.maximumUsingForLoop(testArray));
    }

    @Test
    void testMinimumUsingForLoop() {
        assertEquals(1, calculator.minimumUsingForLoop(testArray));
    }

    @Test
    void testSumUsingForLoop() {
        assertEquals(15, calculator.sumUsingForLoop(testArray));
    }

    @Test
    void testAverageUsingForLoop() {
        assertEquals(3.0, calculator.averageUsingForLoop(testArray));
    }

    @Test
    void testMaximumUsingStream() {
        assertEquals(5, calculator.maximumUsingStream(testArray));
    }

    @Test
    void testMinimumUsingStream() {
        assertEquals(1, calculator.minimumUsingStream(testArray));
    }

    @Test
    void testSumUsingStream() {
        assertEquals(15, calculator.sumUsingStream(testArray));
    }

    @Test
    void testAverageUsingStream() {
        assertEquals(3.0, calculator.averageUsingStream(testArray));
    }
}