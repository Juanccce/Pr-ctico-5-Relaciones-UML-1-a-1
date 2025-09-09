class Usuario {
    private String nombre;
    private String email;
    public Usuario(String nombre, String email) { this.nombre = nombre; this.email = email; }
    public String toString() { return "Usuario{nombre='" + nombre + "', email='" + email + "'}"; }
}
class CodigoQR {
    private String valor;
    private Usuario usuario;
    public CodigoQR(String valor, Usuario usuario) { this.valor = valor; this.usuario = usuario; }
    public String toString() { return "CodigoQR{valor='" + valor + "', usuario=" + usuario + "}"; }
}
class GeneradorQR {
    public void generar(String valor, Usuario usuario) { CodigoQR qr = new CodigoQR(valor, usuario); System.out.println("Generado: " + qr); }
}
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Mario","mario@mail.com");
        new GeneradorQR().generar("https://example.com", u);
    }
}