/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Prueba;

import bookstore.Controlador.RegistroVentaControlador;

/**
 *
 * @author erick
 */
public class PruebaVentaControlador {
    public static void main(String[] args) {
        int cantidad = 100;
        int precio = 50;
        double igv = 0.18;
        
        //Inicializamos el objeto
        RegistroVentaControlador calculo = new RegistroVentaControlador();
        
        //Probando el correcto calculo de descuento        
        
        double descuento = calculo.calculoDescuento(cantidad);
        
        System.out.println("El descuento es de: " + descuento);
        
        //Probando el correcto calculo del subtotal
        
        double subtotal = calculo.subtotal(cantidad, precio, descuento);
        
        System.out.println("El subtotal es:" + subtotal);
        
        //Probando el calculo del total
        
        double total = calculo.totalPago(subtotal, igv);
        
        System.out.println("El total es:" + total);
    }
    
}
