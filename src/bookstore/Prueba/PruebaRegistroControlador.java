
package bookstore.Prueba;

import bookstore.Controlador.RegistroControlador;


public class PruebaRegistroControlador {
    
    public static void main(String[] args) {
        
        RegistroControlador dato = new RegistroControlador();
        
        String datoSeleccionLIB = "LIB";
        String datoSeleccionREV = "REV";
        String datoSeleccionSEP = "SEP";
        
        int contador = (int) Math.floor(Math.random()*(100-1+1)+ 1);
        
        System.out.println(contador);
        
        String idPublicacionLIB = dato.generadorCodigo(contador, datoSeleccionLIB);
        String idPublicacionSEP = dato.generadorCodigo(contador, datoSeleccionSEP);
        String idPublicacionLREV = dato.generadorCodigo(contador, datoSeleccionREV);
        
        System.out.println("El idPublicacion es: " + idPublicacionLIB);
        System.out.println("El idPublicacion es: " + idPublicacionSEP);
        System.out.println("El idPublicacion es: " + idPublicacionLREV);
        
        
    }
    
}
