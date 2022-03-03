package cz.cvut.fel.ts1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FooTest {
    private Foo foo = new Foo();

    @Test
    public void returnNumber_test() {
        assertEquals(5, foo.returnNumber());
    }

    @Test
    public void getNum_test() {
        assertEquals(0, foo.getNum());
    }

    @Test
    public void increment_test() {
        foo.increment();
        assertEquals(1, foo.getNum());
    }

    @Test
    public void exceptionThrown_test() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> foo.exceptionThrown());
        assertEquals("Ocekavana vyjimka", exception.getMessage());
    }

}
