class Contribuyente {
    private String nombre;
    private String cuil;
    public Contribuyente(String nombre, String cuil) { this.nombre = nombre; this.cuil = cuil; }
    public String toString() { return "Contribuyente{nombre='" + nombre + "', cuil='" + cuil + "'}"; }
}
class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    public Impuesto(double monto, Contribuyente contribuyente) { this.monto = monto; this.contribuyente = contribuyente; }
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
    public String toString() { return "Impuesto{monto=" + monto + ", contribuyente=" + contribuyente + "}"; }
}
class Calculadora {
    public void calcular(Impuesto impuesto) { System.out.println("Total a pagar para " + impuesto.getContribuyente() + ": " + impuesto.getMonto()); }
}
public class Main {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Laura","27-12345678-9");
        Impuesto i = new Impuesto(12500.75, c);
        new Calculadora().calcular(i);
    }
}