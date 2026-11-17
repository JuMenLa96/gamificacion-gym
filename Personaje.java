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

    public void registrarActividad(Actividad actividadRealizada) {

        addExperiencia(actividadRealizada.getEstadisticaRelacionada(), actividadRealizada.getExperienciaBase(),
                actividadRealizada.getDificultad());
    }

    private void addExperiencia(String estadisticaTrabajada, double experienciaBase, String dificultad) {
        double experienciaFinal;
        String estadisticaNormalizada = estadisticaTrabajada.toLowerCase().trim();
        String dificultadNormalizada = dificultad.toLowerCase().trim();
        if (dificultadNormalizada.equals("facil")) {
            experienciaFinal = experienciaBase * 1.0;
        } else if (dificultadNormalizada.equals("media")) {
            experienciaFinal = experienciaBase * 1.2;
        } else if (dificultadNormalizada.equals("dificil")) {
            experienciaFinal = experienciaBase * 1.5;
        } else {
            System.out.println("Error al obtener la dificultad");
            return;
        }
        if (estadisticaNormalizada.equals("fuerza")) {
            fuerza.addExp(experienciaFinal);
        } else if (estadisticaNormalizada.equals("destreza")) {
            destreza.addExp(experienciaFinal);

        } else if (estadisticaNormalizada.equals("constitucion") || estadisticaNormalizada.equals("constitución")) {
            constitucion.addExp(experienciaFinal);

        } else if (estadisticaNormalizada.equals("inteligencia")) {
            inteligencia.addExp(experienciaFinal);
        } else if (estadisticaNormalizada.equals("sabiduria") || estadisticaNormalizada.equals("sabiduría")) {
            sabiduria.addExp(experienciaFinal);
        } else if (estadisticaNormalizada.equals("carisma")) {
            carisma.addExp(experienciaFinal);
        } else {
            System.out.println("La estadistica no existe.");
        }
    }
}
