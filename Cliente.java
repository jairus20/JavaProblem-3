
package CapaNegocio;

public class Cliente {
    private String codCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;
    public Factura recibeFactura;

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Cliente (String a, String b, String c, String d){
        codCliente = a;
        nombreCliente = b;
        direccionCliente = c;
        telefonoCliente = d;
    }
    
    public void recibeFactura(Factura e){
        recibeFactura = e;
    }
}
