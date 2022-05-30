
package CapaNegocio;

public class Producto {
    private String codProducto;
    private String descripcionProducto;
    private Double PrecioReferenciaProducto;
    public DetalleFactura EstaenDetalleFactura;
    public DetallePedido estaenPedido;

    public Producto(String c, String d, Double p){
        codProducto = c;
        descripcionProducto = d;
        PrecioReferenciaProducto = p;
    }
    
    public void estaenDetalleFactura(DetalleFactura e){
        EstaenDetalleFactura = e;
    }
    
    public void estaenPedido(DetallePedido e){
        estaenPedido = e;
    }
    
    // Get-Set
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioReferenciaProducto() {
        return PrecioReferenciaProducto;
    }

    public void setPrecioReferenciaProducto(Double PrecioReferenciaProducto) {
        this.PrecioReferenciaProducto = PrecioReferenciaProducto;
    }

}
