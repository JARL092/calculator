import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.add(2, 3), 0.0);  // Приклад тесту для додавання
    }

    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        try {
            calc.divide(5, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }
}
