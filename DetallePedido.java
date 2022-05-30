
package CapaNegocio;


public class DetallePedido {
    private String codDetallePedido;
    private Float cantidadDetallePedido;
    public Producto consignaProducto;
    public Pedido perteneceaPedido;

   public DetallePedido (String a, Float b){
        codDetallePedido = a;
        cantidadDetallePedido = b;
    }
    
    public void consignaProducto(Producto c){
        consignaProducto = c;
    }
    
    public void perteneceaPedido(Pedido c){
        perteneceaPedido = c;
    }
    public String getCodDetallePedido() {
        return codDetallePedido;
    }

    public void setCodDetallePedido(String codDetallePedido) {
        this.codDetallePedido = codDetallePedido;
    }

    public Float getCantidadDetallePedido() {
        return cantidadDetallePedido;
    }

    public void setCantidadDetallePedido(Float cantidadDetallePedido) {
        this.cantidadDetallePedido = cantidadDetallePedido;
    }


}
