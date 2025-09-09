class Foto {
    private String imagen;
    private String formato;
    public Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
    public String toString() { return "Foto{imagen='" + imagen + "', formato='" + formato + "'}"; }
}
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }
    public Pasaporte getPasaporte() { return pasaporte; }
    public String toString() { return "Titular{nombre='" + nombre + "', dni='" + dni + "'}"; }
}
class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = new Foto(imagen, formato);
    }
    public void setTitular(Titular titular) { this.titular = titular; titular.setPasaporte(this); }
    public String toString() { return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + "', foto=" + foto + ", titular=" + titular + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Titular t = new Titular("Juan Perez","12345678");
        Pasaporte p = new Pasaporte("AR123","2023-05-01","img.png","PNG");
        p.setTitular(t);
        System.out.println(p);
        System.out.println("Titular->Pasaporte: " + t.getPasaporte());
    }
}