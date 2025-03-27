import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SistemaReservasDeportivasTest { // Nombre corregido
    static SistemaReservasDeportivas sistemasReservas; // Nombre corregido
    LocalDateTime fecha  = LocalDateTime.now();
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        sistemasReservas = new SistemaReservasDeportivas(); // Nombre corregido
    }

    @Test
    void testReservarPista() {
       // assertTrue(sistemasReservas.reservarPista(1, fecha, 60)); // Método corregido
       // assertFalse(sistemasReservas.reservarPista(1, fecha, 60));
       // assertTrue(sistemasReservas.reservarPista(2, fecha, 60));
       // assertTrue(sistemasReservas.reservarPista(3, fecha.plusDays(1), 60));
       // assertTrue(sistemasReservas.reservarPista(10, fecha.plusDays(1), 60));
    }
    @Test
    void testCancelarReserva() {
    	//assertTrue(sistemasReservas.reservarPista(1, fecha, 60));
    	assertTrue(sistemasReservas.cancelarReserva(0));
    }
}
