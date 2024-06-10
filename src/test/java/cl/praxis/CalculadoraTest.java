package cl.praxis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba de la suma")
    void testSuma() {
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado, "2 + 3 debería ser 5");
    }

    @Test
    @DisplayName("Prueba de la resta")
    void testResta() {
        int resultado = calculadora.resta(2, 3);
        assertEquals(-1, resultado, "2 - 3 debería ser -1");
    }

    @Test
    @DisplayName("Prueba de la multiplicacion")
    void testMultiplicacion() {
        int resultado = calculadora.multiplicacion(2, 3);
        assertEquals(6, resultado, "2 * 3 debería ser 6");
    }

    @Test
    @DisplayName("Prueba de la resta")
    void testDivision() {
        float resultado = calculadora.division(3, 2);
        assertEquals(1.5, resultado, "3 / 2 debería ser 1.5");
    }
}
