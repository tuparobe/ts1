package cz.cvut.fel.ts1.lab04;

import cz.cvut.fel.ts1.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @ParameterizedTest(name = "{0} plus {1} should be equal to {2}")
    @CsvSource({"1, 2, 3", "2, 3, 5"})
    public void add_addsAandB_returnsC(int a, int b, int c) {
// arrange
        Calculator calc = new Calculator();
        int expectedResult = c;
// act
        int result = calc.add(a, b);
// assert
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "{0} multiple {1} should be equal to {2}")
    @CsvSource({"2, 2, 4", "4, 5, 20"})
    public void multiple_multipleAB_returnsC(int a, int b, int c) {
        Calculator calc = new Calculator();

        int actualResult = calc.multiply(a, b);

        assertEquals(c, actualResult);
    }
}
