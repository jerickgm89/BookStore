
package bookstore.Controlador;


public class RegistroVentaControlador {
    
    String nombreCliente;
    int cantidad, precio;
    double subtotal, igv, descuento, total;
    
    public RegistroVentaControlador(){
    }
    
    public double calculoDescuento(int cantidad){
        this.cantidad = cantidad;
        
        if (1 <= cantidad && cantidad <= 4 ) {
            descuento = 0;
        } else if (5 <= cantidad && cantidad <= 10 ){
            descuento = 0.05;
        } else if (11 <= cantidad && cantidad <= 20){
             descuento = 0.1;
        } else if (21 <= cantidad && cantidad <= 50){
             descuento = 0.13;
        } else if (51 <= cantidad && cantidad <= 100){
             descuento = 0.16;
        } else if (101 <= cantidad && cantidad <= 10000){
             descuento = 0.2;
        } else {
            System.out.println("error");
        }
        
        return descuento;
    }
    
    public double subtotal(int cantidad, int precio, double igv){
        this.cantidad = cantidad;
        this.igv = igv;
        this.precio = precio;
        
        int parcial = precio * cantidad;
        
        subtotal = parcial + (parcial * igv);
        
        return subtotal;       
        
    }
    
    public double totalPago(double subtotal, double descuento){
        this.subtotal = subtotal;
        this.descuento = descuento;
        
        total = subtotal - (subtotal * descuento);
        
        return total;
    }    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
