/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author immanuel
 */
public class Cuenta extends Banco{
    double saldo;
    double cantidad;
    
    public double checkSaldo(double saldo){
    return 2000.00;
    }
    
    public void deposito(double cantidad,String a)
    {
        if(cantidad <= 0)
        {
            new WrongAmountException("Cantidad incorrecta");
        }
        else
        {
            saldo = saldo + cantidad;
        }
    } 
    
    
    
    
    
    
    
    public void retiro(double cantidadr){
        if(saldo <= 50.00)
        {
            new SaldoInsuficienteException("su saldo es insuficiente");
        }else
        {
            saldo = saldo - cantidad;
        }
        
    }    

    String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
