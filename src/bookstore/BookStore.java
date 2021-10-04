
package bookstore;

import bookstore.BaseDatos.Conexion;
import bookstore.Vista.VistalPrincipal;




public class BookStore {

    public static void main(String[] args) {
        VistalPrincipal BookStore = new VistalPrincipal();
        BookStore.setVisible(true);
        Conexion c = new Conexion();
        c.getConnection();
 }
    
}
