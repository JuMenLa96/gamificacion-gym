
public class Actividad {
    private String nombre;
    private String estadisticaRelacionada;
    private double experienciaBase;

    public Actividad(String nombre, String estadisticaRelacionada, double experienciaBase) {
        this.nombre = nombre;
        this.estadisticaRelacionada = estadisticaRelacionada;
        this.experienciaBase = experienciaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadisticaRelacionada() {
        return estadisticaRelacionada;
    }

    public double getExperienciaBase() {
        return experienciaBase;
    }

    public void mostrarActividad() {
        System.out.println("Actividad: " + nombre);
        System.out.println("Estadistica: " + estadisticaRelacionada);
        System.out.println("Experiencia: " + experienciaBase);
    }
}
