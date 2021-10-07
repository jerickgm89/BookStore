
package bookstore.Prueba;

import bookstore.BaseDatos.Conexion;
import bookstore.Controlador.ConsultaControlador;
import java.sql.ResultSet;


public class PruebaConsultaControlador {
    
    public static void main(String[] args) {
        
        String seleccionUsuario = "SEP";
        
        ConsultaControlador sentenciaSQL = new ConsultaControlador();
        
        String consultaSQL = sentenciaSQL.ejecucionSQL(seleccionUsuario);
        
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
