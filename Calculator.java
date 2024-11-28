import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, Calculator.subtract(10, 4));
    }
}
