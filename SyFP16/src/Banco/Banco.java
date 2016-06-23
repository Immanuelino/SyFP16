/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author immanuel
 */
public class Banco   {
    List <Cliente> l;
    List<Cuenta> l1;
    
    
    
    public Banco()
    {
        l = new ArrayList();
        l1 = new ArrayList();
    }   
    /**
     *
     */
        public void agregarCliente(Cliente Pepe){
            l.add( Pepe);
            
        }   
        public void agregarCuenta(Cuenta Pepe){
            l1.add((Cuenta) Pepe);
        }
        
        public void guardarCliente(){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt",true)))
            {
                for(Cliente cl: l)
                {
                    bw.write(cl.getNombre()+" "+cl.getEdad()+" "+ cl.getSaldo()+" "+cl.getCantidad()+" "+cl.getNumCuenta()+" "+cl.getIdCliente()+ "n/");
                    
                }
            
            
            } catch (IOException ex) 
            {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        public String guardarCuenta(){
            try(BufferedWriter bw1 = new BufferedWriter(new FileWriter("cuentas.txt",true)))
            {
                for(Cliente cu: l)
                {
                    bw1.write(cu.getNombre()+" "+cu.getEdad()+" "+ cu.getSaldo()+" "+cu.getCantidad()+" "+cu.getNumCuenta()+" "+cu.getIdCliente()+" ");
                    
                }
            
            
            } catch (IOException ex) 
            {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
           
        Banco b = new Banco(){
        
        };
        
        
        

        
      
    
    }
    public static void main(String[] args) {
        Banco b = new Banco();
    
        Cliente l= new Cliente();
        
        Cuenta l1 = new Cuenta();

        
    }
    
}
