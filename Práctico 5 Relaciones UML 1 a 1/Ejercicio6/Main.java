class Cliente {
    private String nombre;
    private String telefono;
    public Cliente(String nombre, String telefono) { this.nombre = nombre; this.telefono = telefono; }
    public String toString() { return "Cliente{nombre='" + nombre + "', telefono='" + telefono + "'}"; }
}
class Mesa {
    private int numero;
    private int capacidad;
    public Mesa(int numero, int capacidad) { this.numero = numero; this.capacidad = capacidad; }
    public String toString() { return "Mesa{numero=" + numero + ", capacidad=" + capacidad + "}"; }
}
class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) { this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa; }
    public String toString() { return "Reserva{fecha='" + fecha + "', hora='" + hora + "', cliente=" + cliente + ", mesa=" + mesa + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Nico","1122334455");
        Mesa m = new Mesa(7,4);
        Reserva r = new Reserva("2025-09-10","21:00", c, m);
        System.out.println(r);
    }
}