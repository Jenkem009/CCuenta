/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;    
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        double cantidad = 0;
        double cantidadEsperada = 0;
        
        probarretirar(objetoCuenta, cantidad);
        probaringresar(objetoCuenta, cantidad): 50);
    }

    public static void probarretirar(CCuenta objetoCuenta, double cantidad) {
        probarretirar(objetoCuenta, cantidad, null);
    }
    
    public static void probarretirar(CCuenta objetoCuenta, double cantidad, float cantidadEsperada) {
        try {
            objetoCuenta.retirar(cantidad);
        }catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void probaringresar(CCuenta objetoCuenta, double cantidad) {
        probaringresar(objetoCuenta, cantidad, null);
    }

    public static void probaringresar(CCuenta objetoCuenta, double cantidad, java.lang.Double cantidadEsperada) {
        try {
            objetoCuenta.ingresar(cantidad);
        }catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}