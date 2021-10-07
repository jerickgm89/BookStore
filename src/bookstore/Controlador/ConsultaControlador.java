
package bookstore.Controlador;


public class ConsultaControlador {
    
    String seleccionUsuario;
    
    public ConsultaControlador(){};
    
    public String ejecucionSQL(String seleccionUsuario){
        String sentenciaSQL = "";
        switch(seleccionUsuario){
             case "LIB":
                 sentenciaSQL = "SELECT IDVENTA, FECHA, IDPUBLICACION, CANTIDAD, TOTAL FROM VENTA WHERE IDPUBLICACION LIKE 'LIB%'";
                 break;
             case "REV":
                 sentenciaSQL = "SELECT IDVENTA, FECHA, IDPUBLICACION, CANTIDAD, TOTAL FROM VENTA WHERE IDPUBLICACION LIKE 'REV%'";
                 break;
             case "SEP":
                 sentenciaSQL = "SELECT IDVENTA, FECHA, IDPUBLICACION, CANTIDAD, TOTAL FROM VENTA WHERE IDPUBLICACION LIKE 'SEP%'";
                 break;
             default:
                 System.out.println("Error");
                 break;
         } 
        
        return sentenciaSQL;
    
    }

    public String getSeleccionUsuario() {
        return seleccionUsuario;
    }

    public void setSeleccionUsuario(String seleccionUsuario) {
        this.seleccionUsuario = seleccionUsuario;
    }
       
    
}
