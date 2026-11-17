
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        String nombre;
        Actividad cardio = new Actividad("cardio", "constitucion", 25, "facil");
        Actividad gimnasio = new Actividad("Entrenamiento en gimnasio", "fuerza", 30, "media");
        Actividad lectura = new Actividad("leer", "sabiduria", 20, "facil");

        System.out.println("Bienvenido jugador. ¿Cual es tu nombre?");
        nombre = scan.nextLine();
        Personaje jugador = new Personaje(nombre);
        System.out.println("Comienza tu aventura, " + nombre + ".");
        do {
            System.out.println("¿Que quieres hacer? (1-4)");
            System.out.println("1. Ver perfil");
            System.out.println("2. Registrar actividad");
            System.out.println("3. Ver objetivos");
            System.out.println("4. Salir");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    jugador.verPerfil();
                    break;
                case 2:
                    cardio.mostrarActividad();
                    gimnasio.mostrarActividad();
                    lectura.mostrarActividad();
                    System.out.println("¿Que actividad quieres realizar?");
                    System.out.println("1- Correr");
                    System.out.println("2- gimnasio");
                    System.out.println("3- leer");
                    int actividadElegida = scan.nextInt();
                    scan.nextLine();
                    switch (actividadElegida) {
                        case 1:
                            jugador.registrarActividad(cardio);
                            break;
                        case 2:
                            jugador.registrarActividad(gimnasio);
                            break;
                        case 3:
                            jugador.registrarActividad(lectura);
                            break;
                        default:
                            System.out.println("Error, por favor elija un número del 1 al 3");
                    }

                    // jugador.registrarActividad(scan);
                    break;
                case 3:
                    System.out.println("Los objetivos aun no estan implementados");
                    break;
                case 4:
                    System.out.println("Se ha acabado la aventura.");
                    break;
                default:
                    System.out.println("Error, por favor elija un número del 1 al 4");
            }
        } while (opcion != 4);
        scan.close();
    }

}
