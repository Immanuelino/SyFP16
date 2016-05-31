/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author administrador1
 */
public class Cesar 
{
    public String cifrar(String mensaje, int constante){
        String resultado = "";
        
        for(int i=0;i<mensaje.length();i++)
        {
            resultado = resultado + (char)(mensaje.charAt(i)+(constante));
            
        }
        return resultado;
    }
    
    public String descifrar(String mensaje, int constante1){
        String resultado = "";
        
        for(int i= 0;i<mensaje.length();i++)
        {
            resultado = resultado + (char)(mensaje.charAt(i)-constante1);
            //resultado = resultado + (char)(s-constante));
        }
        return resultado;
    }
    public static void main(String[] args)
    {
        Cesar c1 = new Cesar();
        String s = c1.cifrar("hola", 5);
        System.out.println(s);
        c1.descifrar(s, 5);
        String i= c1.descifrar(s,5);
        System.out.println(i);
    }
   
    
    
    
}