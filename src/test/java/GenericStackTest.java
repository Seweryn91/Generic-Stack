import exceptions.StackOverflowException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericStackTest {

    @Test
    @DisplayName("Test initialisation of Generic Stack with improper argument")
    void testStackInitialisation_wrongArgument() {
        assertThrows(IllegalArgumentException.class, () -> new GenericStack(0));
        assertThrows(IllegalArgumentException.class, () -> new GenericStack(-10));
    }

    @Test
    @DisplayName("Test pushing elements")
    void testPush() throws StackOverflowException {
        GenericStack stack = new GenericStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int expectedSize = 3;
        int actualSize = stack.spaceTaken();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    @DisplayName("Test pushing too much items")
    void testStackOverflow() throws StackOverflowException {
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        assertThrows(StackOverflowException.class, () -> stack.push(2));
    }
}