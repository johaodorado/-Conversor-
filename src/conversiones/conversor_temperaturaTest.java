package conversiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class conversor_temperaturaTest {

	 @Test
	    public void testCelsiusAKelvin() {
	        conversor_temperatura conversor = new conversor_temperatura();
	        assertDoesNotThrow(() -> {
	            conversor.resultado_conversion("Grado Celsius a Kelvin ", 10); 
	        });
	    }}



/*public class ConversionRequest {
    private String tipoConvercion;
    private double cantidadGrados;

    public ConversionRequest(String tipoConvercion, double cantidadGrados) {
        this.tipoConvercion = tipoConvercion;
        this.cantidadGrados = cantidadGrados;
    }

    public String getTipoConvercion() {
        return tipoConvercion;
    }

    public double getCantidadGrados() {
        return cantidadGrados;
    }
}


public void resultado_conversion(ConversionRequest request) {
    double resultado_conversion = 0;
    String tipoConvercion = request.getTipoConvercion();
    double cantidadGrados = request.getCantidadGrados();

    switch (tipoConvercion) {
        case "Grado Celsius a Kelvin ":
            resultado_conversion = cantidadGrados + 273;
            break;
        case "Grado Celsius a Grado Fahrenheit":
            resultado_conversion = (1.8 * cantidadGrados) + 32;
            break;
        case "Grado Fahrenheit a Grado Celsius":
            resultado_conversion = (cantidadGrados - 32) / 1.8;
            break;
        case "Grado Kelvin a Celsius":
            resultado_conversion = cantidadGrados - 273;
            break;
        case "Grado Fahrenheit a Grado Kelvin":
            resultado_conversion = ((cantidadGrados - 32) / 1.8) + 273;
            break;
        default:
            break;
    }

    JOptionPane.showMessageDialog(null, "El valor de la conversión " + tipoConvercion + " es : " + resultado_conversion);
    mensaje_final mensaje_final = new mensaje_final();
    mensaje_final.mensaje_final();
}
*/