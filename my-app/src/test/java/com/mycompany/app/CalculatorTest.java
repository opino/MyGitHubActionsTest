import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        double result = Calculator.calculate(5.0, 3.0, '+');
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.calculate(10.0, 4.0, '-');
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.calculate(2.5, 3.0, '*');
        assertEquals(7.5, result, 0.0001);
    }

    @Test
    public void testDivision() {
        double result = Calculator.calculate(10.0, 2.0, '/');
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate(5.0, 0.0, '/');
        });
    }

    @Test
    public void testInvalidOperation() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(5.0, 2.0, '%');
        });
    }
}