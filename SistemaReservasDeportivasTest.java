
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Clase que contiene las pruebas para el sistema de reservas deportivas.
 * Las pruebas verifican el funcionamiento de las funcionalidades principales
 * del sistema de reservas, como la reserva de pistas.
 */
class SistemaReservasDeportivasTest {

    static SistemaReservasDeportivas sistemaReservas;

    /**
     * Método que se ejecuta antes de todas las pruebas, y que inicializa el sistema de reservas.
     * Este método se ejecuta una sola vez antes de que se ejecuten las pruebas.
     * 
     * @throws Exception Si ocurre algún error al inicializar el sistema de reservas.
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        sistemaReservas = new SistemaReservasDeportivas();
    }

    /**
     * Prueba para verificar la funcionalidad de reserva de pista.
     * 
     * Se comprueba si es posible reservar una pista en una fecha específica, 
     * así como la validación de la disponibilidad de la pista.
     */
    @Test
    void test() {
    	LocalDateTime Fecha = LocalDateTime.now();
        assertTrue(sistemaReservas.reservarPista(1, Fecha, 60));
        
        assertFalse(sistemaReservas.reservarPista(1, Fecha, 60));
        
        assertTrue(sistemaReservas.reservarPista(3, Fecha, 60));
        
        assertFalse(sistemaReservas.reservarPista(10, Fecha, 60));
    }
}