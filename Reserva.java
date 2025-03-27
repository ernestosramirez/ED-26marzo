import java.time.LocalDateTime;

/**
 * Representa una reserva dentro del sistema de reservas deportivas.
 * Contiene información sobre la pista, la fecha y la duración de la reserva.
 * 
 * @author Ernesto Ramírez
 * @version 1.0
 */
public class Reserva {
    private int idPista;
    private LocalDateTime fecha;
    private int duracion;

    /**
     * Constructor de la clase Reserva.	
     * 
     * @param idPista  Identificador de la pista reservada.
     * @param fecha    Fecha de la reserva en formato "YYYY-MM-DD".
     * @param duracion Duración de la reserva en horas.
     */
    public Reserva(int idPista,LocalDateTime fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

   
    public int getIdPista() {
        return idPista;
    }

   
    public LocalDateTime getFecha() {
        return fecha;
    }

   
    public int getDuracion() {
        return duracion;
    }
}
