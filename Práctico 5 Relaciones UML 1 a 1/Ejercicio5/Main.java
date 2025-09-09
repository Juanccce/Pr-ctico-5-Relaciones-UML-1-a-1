class PlacaMadre {
    private String modelo;
    private String chipset;
    public PlacaMadre(String modelo, String chipset) { this.modelo = modelo; this.chipset = chipset; }
    public String toString() { return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}"; }
}
class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    public Propietario(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
    public Computadora getComputadora() { return computadora; }
    public String toString() { return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}"; }
}
class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    public Computadora(String marca, String numeroSerie, String modeloPM, String chipsetPM) {
        this.marca = marca; this.numeroSerie = numeroSerie; this.placaMadre = new PlacaMadre(modeloPM, chipsetPM);
    }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; propietario.setComputadora(this); }
    public String toString() { return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + "', placaMadre=" + placaMadre + ", propietario=" + propietario + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Propietario p = new Propietario("Marta","30111222");
        Computadora c = new Computadora("Lenovo","SN-001","B550","AMD");
        c.setPropietario(p);
        System.out.println(c);
        System.out.println("Propietario->Computadora: " + p.getComputadora());
    }
}