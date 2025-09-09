class Motor {
    private String tipo;
    private String numeroSerie;
    public Motor(String tipo, String numeroSerie) { this.tipo = tipo; this.numeroSerie = numeroSerie; }
    public String toString() { return "Motor{tipo='" + tipo + "', numeroSerie='" + numeroSerie + "'}"; }
}
class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia) { this.nombre = nombre; this.licencia = licencia; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public String toString() { return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}"; }
}
class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    public Vehiculo(String patente, String modelo, Motor motor) { this.patente = patente; this.modelo = modelo; this.motor = motor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; conductor.setVehiculo(this); }
    public String toString() { return "Vehiculo{patente='" + patente + "', modelo='" + modelo + "', motor=" + motor + ", conductor=" + conductor + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Motor m = new Motor("Nafta","MS-900");
        Conductor c = new Conductor("Pablo","B1234");
        Vehiculo v = new Vehiculo("AB123CD","Corsa", m);
        v.setConductor(c);
        System.out.println(v);
        System.out.println("Conductor->Vehiculo: " + c.getVehiculo());
    }
}