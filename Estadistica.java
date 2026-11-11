
public class Estadistica {

    private String nombre;
    private int nivel;
    private double experiencia;

    public Estadistica(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        experiencia = 0;
    }

    public void addExp(double experiencia) {
        this.experiencia += experiencia;
        comprobarSubidaNivel();
    }

    private void comprobarSubidaNivel() {
        while (experiencia >= calcularExperienciaNecesaria()) {
            experiencia -= calcularExperienciaNecesaria();
            nivel += 1;
            System.out.println("Enhorabuena, tu " + nombre + " ha subido al " + nivel);
        }
    }

    private double calcularExperienciaNecesaria() {
        return (100 * Math.pow(nivel, 1.5));
    }

    public void mostrarEstadistica() {
        System.out.println(nombre + ", nivel " + nivel + " y experiencia " + experiencia);

    }
}
