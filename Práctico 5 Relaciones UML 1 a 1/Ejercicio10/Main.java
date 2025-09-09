class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    public ClaveSeguridad(String codigo, String ultimaModificacion) { this.codigo = codigo; this.ultimaModificacion = ultimaModificacion; }
    public String toString() { return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion='" + ultimaModificacion + "'}"; }
}
class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    public void setCuenta(CuentaBancaria cuenta) { this.cuenta = cuenta; }
    public CuentaBancaria getCuenta() { return cuenta; }
    public String toString() { return "Titular{nombre='" + nombre + "', dni='" + dni + "'}"; }
}
class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    public CuentaBancaria(String cbu, double saldo, String codigo, String fecha) { this.cbu = cbu; this.saldo = saldo; this.clave = new ClaveSeguridad(codigo, fecha); }
    public void setTitular(Titular titular) { this.titular = titular; titular.setCuenta(this); }
    public String toString() { return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + "}"; }
}
public class Main {
    public static void main(String[] args) {
        Titular t = new Titular("Diego","20999888");
        CuentaBancaria c = new CuentaBancaria("2850590940090418123456", 100000.50, "X1Y2Z3", "2025-01-10");
        c.setTitular(t);
        System.out.println(c);
        System.out.println("Titular->Cuenta: " + t.getCuenta());
    }
}