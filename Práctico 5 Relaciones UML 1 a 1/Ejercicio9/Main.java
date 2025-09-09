class Paciente {
    private String nombre;
    private String obraSocial;
    public Paciente(String nombre, String obraSocial) { this.nombre = nombre; this.obraSocial = obraSocial; }
    public String toString() { return "Paciente{nombre='" + nombre + "', obraSocial='" + obraSocial + "'}"; }
}
class Profesional {
    private String nombre;
    private String especialidad;
    public Profesional(String nombre, String especialidad) { this.nombre = nombre; this.especialidad = especialidad; }
    public String toString() { return "Profesional{nombre='" + nombre + "', especialidad='" + especialidad + "'}"; }
}
class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) { this.fecha = fecha; this.hora = hora; this.paciente = paciente; this.profesional = profesional; }
    public String toString() { return "CitaMedica{fecha='" + fecha + "', hora='" + hora + "', paciente=" + paciente + ", profesional=" + profesional + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Paciente p = new Paciente("Sofia","OSDE");
        Profesional pr = new Profesional("Dr. Rios","Cardiologia");
        CitaMedica c = new CitaMedica("2025-09-12","10:30", p, pr);
        System.out.println(c);
    }
}