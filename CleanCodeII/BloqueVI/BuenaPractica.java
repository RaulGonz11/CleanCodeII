package BloqueVI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}

public class BuenaPractica {
    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3), () -> "La suma de 2 y 3 debe ser 5");
    }
}
