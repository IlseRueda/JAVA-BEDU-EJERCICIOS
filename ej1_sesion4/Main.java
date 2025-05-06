public class Main {
    public static void main(String[] args){

        // Constructor por defecto
        TicketSop ticket1 = new TicketSop();
        System.out.println("\n✅ Ticket creado con constructor por defecto:");
        ticket1.mostrInfo();

        // Constructor con parámetros
        TicketSop ticket2 = new TicketSop("Error al iniciar sesión", "Accesos", 1);
        System.out.println("\n✅ Ticket creado con parámetros:");
        ticket2.mostrInfo();

        // Cerrar ticket y mostrar nuevamente
        ticket2.cerrar();
        ticket2.mostrInfo();

        // Constructor de copia
        TicketSop ticket3 = new TicketSop(ticket2);
        System.out.println("\n✅ Ticket copiado desde otro:");
        ticket3.mostrInfo();

        // Constructor sobrecargado con solo título
        TicketSop ticket4 = new TicketSop("Consulta sobre facturación");
        System.out.println("\n✅ Ticket con constructor sobrecargado (solo título):");
        ticket4.mostrInfo();
    }
}
