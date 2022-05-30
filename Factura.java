
package CapaNegocio;


public class Factura {
    private String codRegistroVenta;
    private String tipoPagoRegistroVenta;
    private Double montoRegistroVenta;
    public Cliente correspondeCliente;
    public DetalleFactura tieneDetalleFactura;

    
    public Factura (String a, String b, Double c){
        codRegistroVenta = a;
        tipoPagoRegistroVenta = b;
        montoRegistroVenta = c;
    }
    
    public void correspondeCliente(Cliente d){
        correspondeCliente = d;
    }

    public void tieneDetalleFactura(DetalleFactura d){
        tieneDetalleFactura = d;
    }
    
    public String getCodRegistroVenta() {
        return codRegistroVenta;
    }

    public void setCodRegistroVenta(String codRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
    }

    public String getTipoPagoRegistroVenta() {
        return tipoPagoRegistroVenta;
    }

    public void setTipoPagoRegistroVenta(String tipoPagoRegistroVenta) {
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
    }

    public Double getMontoRegistroVenta() {
        return montoRegistroVenta;
    }

    public void setMontoRegistroVenta(Double montoRegistroVenta) {
        this.montoRegistroVenta = montoRegistroVenta;
    }

}
