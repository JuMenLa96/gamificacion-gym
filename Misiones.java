import java.time.LocalDate;
import java.util.ArrayList;

public class Misiones {
    private String nombre;
    private String tipo;
    private int meta;
    private int progreso;
    private double experienciaRecompensa;
    private boolean completado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Misiones> listaMisiones = new ArrayList<>();

    public Misiones() {
    }

    public Misiones(String nombre, String tipo, int meta, int progreso, double experienciaRecompensa,
            boolean completado, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.meta = meta;
        this.progreso = progreso;
        this.experienciaRecompensa = experienciaRecompensa;
        this.completado = completado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void crearMisionesIniciales(LocalDate fecha) {

        Misiones diaria = new Misiones("mision diaria", "diaria", 1, 0, 20, false, fecha, fecha);
        listaMisiones.add(diaria);
        Misiones semanal = new Misiones("mision semanal", "semanal", 3, 0, 50, false, fecha, fecha.plusDays(6));
        listaMisiones.add(semanal);
    }

    public void reiniciarMisiones(LocalDate fecha) {
        for (Misiones mision : listaMisiones) {
            if (fecha.isAfter(mision.fechaFin)) {
                mision.reiniciarMision(mision, fecha);
            }
        }

    }

    public void reiniciarMision(Misiones mision, LocalDate fecha) {
        this.nombre = mision.nombre;
        this.tipo = mision.tipo;
        this.meta = mision.meta;
        this.progreso = 0;
        this.experienciaRecompensa = mision.experienciaRecompensa;
        this.completado = false;
        this.fechaInicio = fecha;
        if (mision.nombre.equals("diaria")) {
            this.fechaFin = fecha;
        } else if (mision.nombre.equals("semanal")) {
            this.fechaFin = fecha.plusDays(6);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void listaMisiones() {
        for (Misiones mision : listaMisiones) {
            System.out.println(mision.getNombre());
        }
    }
}
