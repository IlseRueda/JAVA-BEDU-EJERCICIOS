public class TicketSop {

    //Atributos
    private String titulo;
    private String categ;
    private int prior;
    private boolean edoAct;

    //Constructor x defecto
    public TicketSop(){
        this.titulo = "Sin titulo";
        this.categ = "General";
        this.prior = 2;
        this.edoAct = true;
    }

    //Constructor con parametros
    public TicketSop(String titulo, String categ, int prior){
        this.titulo = titulo;
        this.categ = categ;
        this.prior = prior;
        this.edoAct = true;
    }

    //Constructor copia
    public TicketSop(TicketSop otro){
        this.titulo = otro.titulo;
        this.categ = otro.categ;
        this.prior = otro.prior;
        this.edoAct = otro.edoAct;
    }

    //Constructor sobrecargado con solo titulo
    public TicketSop(String titulo){
        this.titulo = titulo;
        this.categ = "Sin categoria";
        this.prior = 3;
        this.edoAct = true;
    }
    //Metodo mostrar info
    public void mostrInfo(){
        System.out.println("🎫 Ticket: " + titulo);
        System.out.println("📂 Categoría: " + categ);
        System.out.println("⚠️ Prioridad: " + prior);
        System.out.println("📌 Estado: " + (edoAct? "Activo" : "Cerrado"));
    }

    //Metodo cierra ticket
    public void cerrar(){
        edoAct = false;
        System.out.println("🔒 El ticket '" + titulo + "' ha sido cerrado.");
    }
}
