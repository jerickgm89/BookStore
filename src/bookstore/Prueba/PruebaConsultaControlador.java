
package bookstore.Prueba;

import bookstore.BaseDatos.Conexion;
import java.sql.ResultSet;


public class PruebaConsultaControlador {
    
    public static void main(String[] args) {
          
         
        String consultaSQL = "SELECT IDVENTA, FECHA, IDPUBLICACION, CANTIDAD, TOTAL FROM VENTA WHERE IDPUBLICACION LIKE 'LIB%'";
        
        //Mostrando los datos en la consola  
        Conexion c = new Conexion();
        c.getConnection();
        try { 
                
            ResultSet resultado = c.consultarRegistros(consultaSQL);
            while(resultado.next()){                
                System.out.println(resultado.getString("IDVENTA"));
                System.out.println(resultado.getString("FECHA"));
                System.out.println(resultado.getString("IDPUBLICACION"));
                System.out.println(resultado.getString("CANTIDAD"));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        c.desconexion();
    }
}
