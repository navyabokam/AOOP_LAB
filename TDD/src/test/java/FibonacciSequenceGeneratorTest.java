package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceGeneratorTest {

    FibonacciSequenceGenerator generator = new FibonacciSequenceGenerator();

    @Test
    void testGenerateNthFibonacci() {
        assertEquals(1, generator.generateNthFibonacci(1));
        assertEquals(1, generator.generateNthFibonacci(2));
        assertEquals(2, generator.generateNthFibonacci(3));
        assertEquals(3, generator.generateNthFibonacci(4));
        assertEquals(5, generator.generateNthFibonacci(5));
        assertEquals(8, generator.generateNthFibonacci(6));
        assertEquals(13, generator.generateNthFibonacci(7));
    }

    @Test
    void testGenerateFibonacciList() {
        assertArrayEquals(new int[]{1}, generator.generateFibonacciList(1));
        assertArrayEquals(new int[]{1, 1}, generator.generateFibonacciList(2));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5}, generator.generateFibonacciList(5));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, generator.generateFibonacciList(10));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> generator.generateNthFibonacci(0));
        assertThrows(IllegalArgumentException.class, () -> generator.generateFibonacciList(0));
    }
}
