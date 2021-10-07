
package bookstore.Controlador;


public class RegistroControlador {
    String titulo, autor, datoSeleccion;
    int numeroEdicion, cantidadStock, precio, contador;
    
    //Contructor
    public RegistroControlador(){};
    
    public String generadorCodigo(int contador, String datoSeleccion){
        contador += 1;
        
        String idCodigo = "";
            if (contador >= 10) {
                idCodigo = datoSeleccion + "000" + contador;                    
            }else if (contador >= 100){
                idCodigo = datoSeleccion + "00" + contador;  
            }else {
                idCodigo = datoSeleccion + "0000" + contador;
            }
            
        return idCodigo;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
