import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Sistema de reservas para pistas deportivas, permitiendo reservar, cancelar
 * y gestionar la iluminación de las pistas.
 * 
 * @author Ernesto Ramírez
 * @version 1.0
 */
public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    GestorIluminacion data = new GestorIluminacion();
	static final int MAX_PISTAS = 10; // Máximo de 10 pistas

    /**
     * Constructor que inicializa la lista de reservas y el estado de la iluminación.
     */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }

    /**
     * Realiza la reserva de una pista en una fecha determinada.
     * 
     * @param idPista  Identificador de la pista (0 a 9).
     * @param fecha    Fecha de la reserva en formato "YYYY-MM-DD".
     * @param duracion Duración de la reserva en horas.
     * @return true si la reserva fue exitosa, false si la pista ya está reservada o el ID es inválido.
     */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == reserva.getIdPista() && esFechadisponible(reserva.getFecha(), r)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(reserva);
        return true;
    }

    /**
     * Cancela una reserva existente.
     * 
     * @param idReserva Identificador de la reserva a cancelar.
     * @return true si la reserva fue eliminada, false si no se encontró.
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }

    /**
     * Verifica si una pista está disponible en una fecha y hora específica.
     * 
     * @param idPista Identificador de la pista.
     * @param fecha   Fecha en la que se desea reservar.
     * @param hora    Hora en la que se desea reservar.
     * @return true si la pista está disponible, false si ya está reservada.
     */
    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechadisponible(fecha, r)) {
                return false; // La pista no está disponible
            }
        }
        return true; // La pista está disponible
    }

	private boolean esFechadisponible(LocalDateTime fecha, Reserva r) {
		return r.getFecha().equals(fecha);
	}
}
