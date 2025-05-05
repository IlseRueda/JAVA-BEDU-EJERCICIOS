public class EjVar {
    public static void main(String[] args){
        int edad = 24;
        double salario = 15000.25;
        boolean activo = true;
        char inicial = 'G';
        var ciudad = "Mexico";

        // Imprimir los valores almacenados en las variables
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ciudad: " + ciudad);

        // Conversiónes
        double precio = 200.59;
        int precioRedond = (int) precio;
        System.out.println("Precio original: " + precio);
        System.out.println("Precio redondeado: " + precioRedond);
    }
}
