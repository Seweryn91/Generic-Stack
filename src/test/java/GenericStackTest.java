import exceptions.StackOverflowException;
import exceptions.StackUnderflowException;
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
    void testStackOverflow() throws StackOverflowException, StackUnderflowException {
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        assertThrows(StackOverflowException.class, () -> stack.push(2));
    }

    @Test
    @DisplayName("Test popping too much items")
    void testStackUnderflow() throws StackUnderflowException, StackOverflowException {
        GenericStack stack = new GenericStack(1);
        stack.push(1);
        stack.pop();
        assertThrows(StackUnderflowException.class, () -> stack.pop());

    }

    @Test
    @DisplayName("Test peeking")
    void testStackPeek() throws StackOverflowException {
        GenericStack stack = new GenericStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(79);

        int expected = 79;
        assertEquals(expected, stack.peek());
    }

    @Test
    @DisplayName("Test popping elements from stack")
    void testPop() throws StackOverflowException, StackUnderflowException {
        GenericStack stack = new GenericStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(15);

        int expected = 15;
        assertEquals(expected, stack.pop());
    }
}