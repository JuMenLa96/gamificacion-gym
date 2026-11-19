import java.time.LocalDate;

public class Racha {
    private Actividad actividad;
    private int diasConsecutivos;
    private int mejorRacha;
    private LocalDate ultimaFecha;

    public Racha(Actividad actividad) {
        this.actividad = actividad;
        diasConsecutivos = 0;
        mejorRacha = 0;
    }

    public Actividad getActividad() {
        return actividad;

    }

    public void actualizarRacha(LocalDate fecha) {
        if (ultimaFecha == null) {
            diasConsecutivos = 1;
        } else if (fecha == ultimaFecha) {
            diasConsecutivos = diasConsecutivos;
        } else if (ultimaFecha.plusDays(1).equals(fecha)) {
            diasConsecutivos += 1;
        } else {
            diasConsecutivos = 1;
        }
        if (diasConsecutivos > mejorRacha) {
            mejorRacha = diasConsecutivos;
        }
        ultimaFecha = fecha;
    }

    public double obtenerMultiplicador() {
        if (diasConsecutivos >= 3) {
            return 1.2;
        } else {
            return 1.0;
        }
    }
}
