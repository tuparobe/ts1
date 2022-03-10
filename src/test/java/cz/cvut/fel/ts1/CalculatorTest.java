package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void add_twoPlusThree_isFive() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void substract_ThreeMinusThree_isZero() {
        assertEquals(0, calc.subtract(3, 3));
    }

    @Test
    public void multiply_TwoMultiplyByThree_isSix() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void divide_SixDividedByTwo_isThree() {
        assertEquals(3, calc.divide(6, 2));
    }
}
