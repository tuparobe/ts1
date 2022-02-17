package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void factorialTest() {
        Factorial fact = new Factorial();
        assertEquals(fact.factorial(3), 6);
    }
}
