import java.util.Scanner;
public class EnvioPaq {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrsa el tipo de paqute (chico,mediano,grande): ");
        String tipo = scanner.nextLine();
        double costo = 0;

        //CONDICIONAL IF ELSE
        if(tipo.equalsIgnoreCase("pequeño")){
            costo = 49.99;
        } else if (tipo.equalsIgnoreCase("mediano")) {
            costo = 89.99;
        } else if (tipo.equalsIgnoreCase("grande")) {
            costo = 149.99;
        }else {
            System.out.println("Tipo de paquete no valido");
        }
        if (costo > 0){
            System.out.println("Costo del envío: $" + costo);
        }
        scanner.close();
    }
}
