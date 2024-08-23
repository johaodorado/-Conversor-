package conversiones.conversor_moneda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class conversor_monedaTest {

    @Test
    public void testUSDtoCOP() {
        conversor_moneda conversor = new conversor_moneda();
        assertDoesNotThrow(() -> {
            conversor.resultado_conversion("De Dolar a Pesos(COP)", "50");
        }, "El método debería ejecutarse sin lanzar excepciones.");
    }
}