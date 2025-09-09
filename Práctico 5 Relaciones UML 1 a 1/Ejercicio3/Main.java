class Autor {
    private String nombre;
    private String nacionalidad;
    public Autor(String nombre, String nacionalidad) { this.nombre = nombre; this.nacionalidad = nacionalidad; }
    public String toString() { return "Autor{nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}"; }
}
class Editorial {
    private String nombre;
    private String direccion;
    public Editorial(String nombre, String direccion) { this.nombre = nombre; this.direccion = direccion; }
    public String toString() { return "Editorial{nombre='" + nombre + "', direccion='" + direccion + "'}"; }
}
class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) { this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial; }
    public String toString() { return "Libro{titulo='" + titulo + "', isbn='" + isbn + "', autor=" + autor + ", editorial=" + editorial + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Autor a = new Autor("Borges","Argentina");
        Editorial e = new Editorial("Sudamericana","Buenos Aires");
        Libro l = new Libro("Ficciones","12345", a, e);
        System.out.println(l);
    }
}