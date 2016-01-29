package modelo;
/**
 * @author DrowSoft
 */
public class VentasXML {
    private String productos,cliente,pago,empleado,fecha;

    public VentasXML(String productos, String cliente, String pago, String empleado, String fecha) {
        this.productos = productos;
        this.cliente = cliente;
        this.pago = pago;
        this.empleado = empleado;
        this.fecha = fecha;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
