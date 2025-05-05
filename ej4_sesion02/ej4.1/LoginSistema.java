import java.util.Scanner;
public class LoginSistema {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String contraBien = "gerita1302";
        String input;
        int intentos = 0;
        int maxInt = 3;

        while (intentos < maxInt){
            System.out.print("Ingresa tu contraseña: ");
            input = scanner.nextLine();

            if (input.equals(contraBien)){
                System.out.println("Acceso Concedido");
                break;
            }else {
                System.out.println("Acceso Denegado");
                intentos++;
            }
        }
        if (intentos == maxInt){
            System.out.println("Se excedio el numero de intentos");
        }
        scanner.close();
    }
}
