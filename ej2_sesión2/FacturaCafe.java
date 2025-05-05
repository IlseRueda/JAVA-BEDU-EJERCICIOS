public class FacturaCafe {
    public static void main(String[] args) {
        double precCafe = 45.50;
        double precPastel = 80.00;
        double precAgua = 20.00;

        int numCafe = 4;
        int numPastel = 2;
        int numAgua = 1;

        //El cliente agrega otro pastel
        numPastel++;//se incrementa en 1

        // Cálculo del total (con prioridad de operadores)
        double total = (precCafe * numCafe) + (precPastel * numPastel) + (precAgua * numAgua);

        // Descuento si el total supera $150
        boolean promoDesc = total > 150;
        // Asignación del descuento (10%)}
        double descuento = promoDesc ? total * 0.10 : 0;

        //Total final
        double totFin = total - descuento;

        //Salida de datos
        System.out.println("Total de la compra: $ " + total);
        System.out.println("¿Aplica descuento?:" + promoDesc);
        System.out.println("Descuento aplicado: $ " + descuento);
        System.out.println("Total final: $ " + totFin);
    }
}
