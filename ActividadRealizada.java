import java.time.LocalDate;

public class ActividadRealizada {
    private Actividad actividad;
    private LocalDate fecha;
    private double experienciaGanada;

    public ActividadRealizada(Actividad actividad, LocalDate fecha, double experienciaGanada) {
        this.actividad = actividad;
        this.fecha = fecha;
        this.experienciaGanada = experienciaGanada;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getExperienciaGanada() {
        return experienciaGanada;
    }

    public void mostrarRegistro() {
        System.out.println("Actividad: " + actividad.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Experiencia ganada: " + experienciaGanada);
    }
}
