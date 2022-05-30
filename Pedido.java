
package CapaNegocio;


public class Pedido {
    private String codPedido;
    private String fechaHoraPedido;
    private String estadoPedido;
    public DetallePedido contieneDetallePedido;
    public Motorizado atendidoporMotorizado;

    public Pedido (String a, String b, String c){
        codPedido = a;
        fechaHoraPedido = b;
        estadoPedido = c;
    }
    
    public void contieneDetallePedido(DetallePedido d){
        contieneDetallePedido = d;
    }

    public void atendidoporMotorizado(Motorizado d){
        atendidoporMotorizado = d;
    }
    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(String fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }


}
