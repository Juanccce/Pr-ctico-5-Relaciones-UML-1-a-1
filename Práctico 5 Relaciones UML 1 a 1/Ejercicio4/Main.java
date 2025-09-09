class Banco {
    private String nombre;
    private String cuit;
    public Banco(String nombre, String cuit) { this.nombre = nombre; this.cuit = cuit; }
    public String toString() { return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}"; }
}
class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;
    public Cliente(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public String toString() { return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}"; }
}
class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }
    public void setCliente(Cliente cliente) { this.cliente = cliente; cliente.setTarjeta(this); }
    public String toString() { return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + fechaVencimiento + "', cliente=" + cliente + ", banco=" + banco + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Banco b = new Banco("Banco Rio","30-12345678-9");
        Cliente c = new Cliente("Luis","22222222");
        TarjetaDeCredito t = new TarjetaDeCredito("4500 1234 5678 9999","12/28", b);
        t.setCliente(c);
        System.out.println(t);
        System.out.println("Cliente->Tarjeta: " + c.getTarjeta());
    }
}