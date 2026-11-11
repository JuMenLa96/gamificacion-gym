
import java.util.Scanner;

public class Personaje {

    private String nombre;
    private int nivel = 1;
    private double experiencia = 0;

    private Estadistica fuerza;
    private Estadistica destreza;
    private Estadistica constitucion;
    private Estadistica inteligencia;
    private Estadistica sabiduria;
    private Estadistica carisma;

    public Personaje(String nombre) {
        this.nombre = nombre;
        fuerza = new Estadistica("Fuerza");
        destreza = new Estadistica("Destreza");
        constitucion = new Estadistica("Constitución");
        inteligencia = new Estadistica("Inteligencia");
        sabiduria = new Estadistica("Sabiduría");
        carisma = new Estadistica("Carisma");

    }

    public void verPerfil() {
        System.out.println("El jugador se llama: " + nombre + ".");
        System.out.println("Es de nivel " + nivel + ", y su experiencia es " + experiencia);
        System.out.println("Sus atributos son: ");
        fuerza.mostrarEstadistica();
        destreza.mostrarEstadistica();
        constitucion.mostrarEstadistica();
        inteligencia.mostrarEstadistica();
        sabiduria.mostrarEstadistica();
        carisma.mostrarEstadistica();
    }

    public void registrarActividad(Scanner scan) {
        System.out.println("¿Que estadistica has trabajado?");
        String estadisticaTrabajada = scan.nextLine();
        System.out.println("¿Cuanta experiencia recibiste?");
        double experienciaGanada = scan.nextDouble();
        scan.nextLine();
        addExperiencia(estadisticaTrabajada, experienciaGanada);
    }

    private void addExperiencia(String estadisticaTrabajada, double experienciaGanada) {
        String estadisticaNormalizada = estadisticaTrabajada.toLowerCase().trim();
        if (estadisticaNormalizada.equals("fuerza")) {
            fuerza.addExp(experienciaGanada);
        } else if (estadisticaNormalizada.equals("destreza")) {
            destreza.addExp(experienciaGanada);

        } else if (estadisticaNormalizada.equals("constitucion") || estadisticaNormalizada.equals("constitución")) {
            constitucion.addExp(experienciaGanada);

        } else if (estadisticaNormalizada.equals("inteligencia")) {
            inteligencia.addExp(experienciaGanada);
        } else if (estadisticaNormalizada.equals("sabiduria") || estadisticaNormalizada.equals("sabiduría")) {
            sabiduria.addExp(experienciaGanada);
        } else if (estadisticaNormalizada.equals("carisma")) {
            carisma.addExp(experienciaGanada);
        } else {
            System.out.println("La estadistica no existe.");
        }
    }
}
