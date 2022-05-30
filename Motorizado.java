
package CapaNegocio;

public class Motorizado {
    private String codMotorizado;
    private String nombreMotorizado;
    private String celularMotorizado;
    public Pedido atiendePedido;

    public String getCodMotorizado() {
        return codMotorizado;
    }

    public void setCodMotorizado(String codMotorizado) {
        this.codMotorizado = codMotorizado;
    }

    public String getNombreMotorizado() {
        return nombreMotorizado;
    }

    public void setNombreMotorizado(String nombreMotorizado) {
        this.nombreMotorizado = nombreMotorizado;
    }

    public String getCelularMotorizado() {
        return celularMotorizado;
    }

    public void setCelularMotorizado(String celularMotorizado) {
        this.celularMotorizado = celularMotorizado;
    }

    public Motorizado (String a, String b, String c){
        codMotorizado = a;
        nombreMotorizado = b;
        celularMotorizado = c;
    }
    
    public void atiendePedido(Pedido d){
        atiendePedido = d;
    }
}
