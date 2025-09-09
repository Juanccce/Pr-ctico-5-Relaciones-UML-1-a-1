class Usuario {
    private String nombre;
    private String email;
    public Usuario(String nombre, String email) { this.nombre = nombre; this.email = email; }
    public String toString() { return "Usuario{nombre='" + nombre + "', email='" + email + "'}"; }
}
class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) { this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario; }
    public String toString() { return "FirmaDigital{codigoHash='" + codigoHash + "', fecha='" + fecha + "', usuario=" + usuario + "}"; }
}
class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    public Documento(String titulo, String contenido, String hash, String fecha, Usuario usuario) {
        this.titulo = titulo; this.contenido = contenido; this.firma = new FirmaDigital(hash, fecha, usuario);
    }
    public String toString() { return "Documento{titulo='" + titulo + "', contenido='" + contenido + "', firma=" + firma + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("Caro","caro@mail.com");
        Documento d = new Documento("Contrato","Contenido","ABC123","2025-09-08", u);
        System.out.println(d);
    }
}