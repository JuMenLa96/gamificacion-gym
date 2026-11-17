
public class Actividad {
    private String nombre;
    private String estadisticaRelacionada;
    private double experienciaBase;
    private String dificultad;

    public Actividad(String nombre, String estadisticaRelacionada, double experienciaBase, String dificultad) {
        this.nombre = nombre;
        this.estadisticaRelacionada = estadisticaRelacionada;
        this.experienciaBase = experienciaBase;
        this.dificultad = dificultad;
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

    public String getDificultad() {
        return dificultad;
    }

    public void mostrarActividad() {
        System.out.println("Actividad: " + nombre);
        System.out.println("Estadistica: " + estadisticaRelacionada);
        System.out.println("Experiencia: " + experienciaBase);
    }
}
