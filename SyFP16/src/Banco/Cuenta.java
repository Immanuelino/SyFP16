/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author immanuel
 */
public class Cuenta extends Cliente{
   
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
    
    
    
}
