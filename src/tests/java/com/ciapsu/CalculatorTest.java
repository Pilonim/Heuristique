package tests.java.com.ciapsu;

import main.java.com.ciapsu.Calculator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    @Test
    public void additionShouldWorkCorrectly() {
        List<Integer> numbers = Arrays.asList(1, 2);
        int result = Calculator.add(numbers.get(0), numbers.get(1));
        assertEquals(3, result);
    }

    @Test
    public void additionShouldNotWorkCorrectly() {
        List<Integer> numbers = Arrays.asList(1, 2);
        int result = Calculator.add(numbers.get(0), numbers.get(1));
        assertNotEquals(4, result);
    }

    @Test
    public void multiplicationShouldWorkCorrectly() {
        List<Integer> numbers = Arrays.asList(2, 3);
        int result = Calculator.multiply(numbers.get(0), numbers.get(1));
        assertEquals(6, result);
    }

    @Test
    public void multiplicationShouldNotWorkCorrectly() {
        List<Integer> numbers = Arrays.asList(2, 3);
        int result = Calculator.multiply(numbers.get(0), numbers.get(1));
        assertNotEquals(8, result);
    }
}