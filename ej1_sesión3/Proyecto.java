public class Proyecto {

    // Atributos del proyecto
    private String nombre;
    private String cliente;
    private int duracSem;
    private  boolean edoAct;

    // static - Atributo estático: número total de proyectos creados
    public static int totProy = 0;

    // final - Constante: nombre del sistema
    public static final String NOMBRE_SISTEMA = "GestionProy v1.0";

    // Constructor
    public Proyecto(String nombre, String cliente, int duracSem, boolean edoAct) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracSem= duracSem;
        this.edoAct = edoAct;
        totProy++;  // Se incrementa cada vez que se crea un nuevo proyecto
    }

    // Método para mostrar información del proyecto
    public void mostrarInformacion() {
        System.out.println(" Proyecto: " + nombre);
        System.out.println("Cliente: " + cliente);
        System.out.println("Duración: " + duracSem + " semanas");
        System.out.println("¿Activo?: " + (edoAct ? "Sí" : "No"));
    }

    // Método para marcar el proyecto como inactivo
    public void cerrarProyecto() {
        edoAct = false;
        System.out.println("El proyecto '" + nombre + "' ha sido cerrado.");
    }
}

