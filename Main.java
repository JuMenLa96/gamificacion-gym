
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        int actividadElegida;
        String nombre;
        Actividad cardio = new Actividad("cardio", "constitucion", 25, "facil");
        Actividad gimnasio = new Actividad("Entrenamiento en gimnasio", "fuerza", 30, "media");
        Actividad lectura = new Actividad("leer", "sabiduria", 20, "facil");
        Actividad[] listaActividades = new Actividad[3];
        listaActividades[0] = cardio;
        listaActividades[1] = gimnasio;
        listaActividades[2] = lectura;
        System.out.println("Bienvenido jugador. ¿Cual es tu nombre?");
        nombre = scan.nextLine();
        Personaje jugador = new Personaje(nombre);
        System.out.println("Comienza tu aventura, " + nombre + ".");
        do {
            System.out.println("¿Que quieres hacer? (1-4)");
            System.out.println("1. Ver perfil");
            System.out.println("2. Registrar actividad");
            System.out.println("3. Ver objetivos");
            System.out.println("4. Mostrar historial");
            System.out.println("5. salir");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    jugador.verPerfil();
                    break;
                case 2:
                    for (int i = 0; i < listaActividades.length; i++) {
                        System.out.println((i + 1));
                        listaActividades[i].mostrarActividad();
                    }
                    do {
                        System.out.println("¿Que actividad quieres realizar?");
                        actividadElegida = scan.nextInt() - 1;
                        scan.nextLine();
                        if (actividadElegida < 0 || actividadElegida > listaActividades.length - 1) {
                            System.out.println("Numero incorrecto, vuelva a intentarlo.");
                        }
                    } while (actividadElegida < 0 || actividadElegida > listaActividades.length - 1);
                    jugador.registrarActividad(listaActividades[actividadElegida]);
                    /*
                     * switch (actividadElegida) {
                     * case 1:
                     * jugador.registrarActividad(cardio);
                     * break;
                     * case 2:
                     * jugador.registrarActividad(gimnasio);
                     * break;
                     * case 3:
                     * jugador.registrarActividad(lectura);
                     * break;
                     * default:
                     * System.out.println("Error, por favor elija un número del 1 al 3");
                     * }
                     */

                    // jugador.registrarActividad(scan);
                    break;
                case 3:
                    System.out.println("Los objetivos aun no estan implementados");
                    break;
                case 4:
                    jugador.mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Se ha acabado la aventura.");
                    break;
                default:
                    System.out.println("Error, por favor elija un número del 1 al 4");
            }
        } while (opcion != 5);
        scan.close();
    }

}
