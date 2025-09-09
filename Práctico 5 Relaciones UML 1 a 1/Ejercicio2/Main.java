class Bateria {
    private String modelo;
    private int capacidad;
    public Bateria(String modelo, int capacidad) { this.modelo = modelo; this.capacidad = capacidad; }
    public String toString() { return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + "}"; }
}
class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    public Usuario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setCelular(Celular celular) { this.celular = celular; }
    public Celular getCelular() { return celular; }
    public String toString() { return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}"; }
}
class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; usuario.setCelular(this); }
    public String toString() { return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + "', bateria=" + bateria + ", usuarioclear=" + usuario + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Bateria b = new Bateria("B123", 4000);
        Usuario u = new Usuario("Ana","45678901");
        Celular c = new Celular("IMEI-001","Samsung","A50", b);
        c.setUsuario(u);
        System.out.println(c);
        System.out.println("Usuario->Celular: " + u.getCelular());
    }
}