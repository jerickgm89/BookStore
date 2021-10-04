/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jeric
 */
public class Conexion {
    private static Connection conn = null;
    private static String login = "BOOKSTORE";
    private static String clave = "admin";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexion Exitosa");
            }else {
                System.out.println("Conexion Erronea");
            }      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea " + e.getMessage() );
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
            System.out.println("Desconexion Exitosa");
        } catch (Exception e) {
            System.out.println("Error al desconectar" + e.getMessage());
        }
    }
    
    //CRUD
    //Insertar a la tabla en la base de datos
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    //Obtener datos
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }        
      
    }
    
}
