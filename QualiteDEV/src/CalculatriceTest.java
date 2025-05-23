import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    private Calculatrice calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculatrice();
    }

    @Test
    public void testAdd() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f), 0.001f);
    }

    @Test
    public void testDiv() {
        assertEquals(10.0f, calc.div(20.0f, 2.0f), 0.001f);
    }

    @Test
    public void testDivParZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.div(6.0f, 0.0f);
        });
    }

    @Test
    public void testMult(){
        assertEquals(90.0f,calc.mult(45.0f, 2.0f), 0.001f);
    }

}