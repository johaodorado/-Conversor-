package conversiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorTemperaturaTest2 {

	@Test
    public void testCelsiusAKelvin() {
        conversor_temperatura conversor = new conversor_temperatura();
        assertDoesNotThrow(() -> {
            conversor.resultado_conversion("Grado Fahrenheit a Celsius ", 32); 
        });
    }}
