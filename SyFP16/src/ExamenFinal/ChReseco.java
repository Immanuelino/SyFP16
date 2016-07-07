/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author immanuel
 */
public class ChReseco extends Champu {
    public String n1;
    public String q1;
    public int no1;
        
   
    
        
    public ChReseco(String name, String quantity, int noDeSerie){
        super(name, quantity, noDeSerie);
        
        n1 = name;
        q1 = quantity;
        no1 = noDeSerie;
        
       
    }
    public void print(){
        System.out.println(n1);
        System.out.println(q1);
        System.out.println(no1);
    }
    

    
    
}
