public class CarritoComp {
    public static void main(String[] args){
        String[] productos = {"Laptop", "Mouse", "Teclado", "Pantalla", "Audífonos"};

        //for clasico(imprime el arreglo)
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < productos.length; i++ ){
            System.out.println("- " + productos[i]);
        }
        System.out.println("Flujo con for-each: ");
        for (String producto : productos){
            if (producto.equals("Teclado")) continue; //Salta teclado
            if (producto.equals("Pantalla"))break;// Se detiene en pantalla
            System.out.println("Producto valido: " + producto);
        }
    }
}
