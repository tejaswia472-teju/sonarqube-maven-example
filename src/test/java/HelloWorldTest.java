import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    private final HelloWorld helloWorld = new HelloWorld();

    @Test
    void testGetGreetingWithName() {
        String result = helloWorld.getGreeting("Osanda");
        assertEquals("Hello Osanda", result);
    }

    @Test
    void testGetGreetingWithoutName() {
        String result = helloWorld.getGreeting("");
        assertEquals("Hello Guest", result);
    }

    @Test
    void testAdd() {
        assertEquals(10, helloWorld.add(4, 6));
    }

    @Test
    void testIsEvenTrue() {
        assertTrue(helloWorld.isEven(8));
    }

    @Test
    void testIsEvenFalse() {
        assertFalse(helloWorld.isEven(5));
    }

    @Test
    void testDivide() {
        assertEquals(5, helloWorld.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> helloWorld.divide(10, 0)
        );
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
