class Artista {
    private String nombre;
    private String genero;
    public Artista(String nombre, String genero) { this.nombre = nombre; this.genero = genero; }
    public String toString() { return "Artista{nombre='" + nombre + "', genero='" + genero + "'}"; }
}
class Cancion {
    private String titulo;
    private Artista artista;
    public Cancion(String titulo, Artista artista) { this.titulo = titulo; this.artista = artista; }
    public String toString() { return "Cancion{titulo='" + titulo + "', artista=" + artista + "}"; }
}
class Reproductor {
    public void reproducir(Cancion cancion) { System.out.println("Reproduciendo: " + cancion); }
}
public class Main {
    public static void main(String[] args) {
        Artista a = new Artista("Soda Stereo","Rock");
        Cancion c = new Cancion("De musica ligera", a);
        Reproductor r = new Reproductor();
        r.reproducir(c);
    }
}