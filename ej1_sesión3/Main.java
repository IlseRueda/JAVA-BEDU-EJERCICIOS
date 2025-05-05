public class Main {
    public static void main(String[] args){

        // Uso de atributo final : Accedemos al nombre del sistema definido como constante
        System.out.println("Sistema: " + Proyecto.NOMBRE_SISTEMA);

        // Creación de objetos: Instanciamos dos proyectos con datos reales
        Proyecto p1 = new Proyecto("Sitio Web", "Cliente A", 12, true);
        Proyecto p2 = new Proyecto("Aplicacion móvil", "Cliente G",20,true);

        // Uso de métodos: Mostramos los detalles de cada proyecto
        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
        System.out.println();

        // Simulamos el cierre de un proyecto
        p1.cerrarProyecto();

        // Mostramos nuevamente los datos del proyecto cerrado
        System.out.println();
        p1.mostrarInformacion();

        // Uso de atributo static: Total de proyectos creados
        System.out.println("Total de proyectos creados: " + Proyecto.totProy);
    }
}
