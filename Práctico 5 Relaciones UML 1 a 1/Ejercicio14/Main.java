class Proyecto {
    private String nombre;
    private int duracionMin;
    public Proyecto(String nombre, int duracionMin) { this.nombre = nombre; this.duracionMin = duracionMin; }
    public String toString() { return "Proyecto{nombre='" + nombre + "', duracionMin=" + duracionMin + "}"; }
}
class Render {
    private String formato;
    private Proyecto proyecto;
    public Render(String formato, Proyecto proyecto) { this.formato = formato; this.proyecto = proyecto; }
    public String toString() { return "Render{formato='" + formato + "', proyecto=" + proyecto + "}"; }
}
class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) { Render r = new Render(formato, proyecto); System.out.println("Exportado: " + r); }
}
public class Main {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Spot", 60);
        new EditorVideo().exportar("MP4", p);
    }
}