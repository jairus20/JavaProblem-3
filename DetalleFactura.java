
package CapaNegocio;


public class DetalleFactura {
    private String codDetalleFactura;
    private Double precioRealUnitarioDetalleFactura;
    private Double subtotalDetalleFactura;
    private Float cantidadDetalleFactura;
    public Factura perteneceFactura;
    public Producto contieneProducto;

    public DetalleFactura (String a, Double b, Double c, Float d){
        codDetalleFactura = a;
        precioRealUnitarioDetalleFactura = b;
        subtotalDetalleFactura = c;
        cantidadDetalleFactura = d;
    }
    
    public void perteneceFactura(Factura e){
        perteneceFactura = e;
    }
    
    
    public void contieneProducto(Producto e){
        contieneProducto = e;
    }
    public String getCodDetalleFactura() {
        return codDetalleFactura;
    }

    public void setCodDetalleFactura(String codDetalleFactura) {
        this.codDetalleFactura = codDetalleFactura;
    }

    public Double getPrecioRealUnitarioDetalleFactura() {
        return precioRealUnitarioDetalleFactura;
    }

    public void setPrecioRealUnitarioDetalleFactura(Double precioRealUnitarioDetalleFactura) {
        this.precioRealUnitarioDetalleFactura = precioRealUnitarioDetalleFactura;
    }

    public Double getSubtotalDetalleFactura() {
        return subtotalDetalleFactura;
    }

    public void setSubtotalDetalleFactura(Double subtotalDetalleFactura) {
        this.subtotalDetalleFactura = subtotalDetalleFactura;
    }

    public Float getCantidadDetalleFactura() {
        return cantidadDetalleFactura;
    }

    public void setCantidadDetalleFactura(Float cantidadDetalleFactura) {
        this.cantidadDetalleFactura = cantidadDetalleFactura;
    }


}
