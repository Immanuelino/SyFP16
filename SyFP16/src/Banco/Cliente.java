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
public class Cliente{
    String nombre;
    int edad;
    double saldo;
    double cantidad;
    int numCuenta;
    int idCliente;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    
   

    public double getSaldo() {
        return saldo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    
    
    //usar setters y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
    
}
