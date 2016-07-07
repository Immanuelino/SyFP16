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
public class JManos extends JabonSup{
    public String n2;
    public String c2;
    public String t2;

    public JManos(String cName, String cColor, String cTipo) {
        super(cName, cColor, cTipo);
        
        n2 = name;
        c2 = color;
        t2 = tipo;
        
    }
    public void print(){
        System.out.println(n2);
        System.out.println(c2);
        System.out.println(t2);
    }

}