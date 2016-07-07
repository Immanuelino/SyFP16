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
public class JNeutro extends JabonSup{
    public String n2;
    public String c2;
    public String t2;

    public JNeutro(String cName, String cColor, String cTipo) {
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

    @Override
    public int Champu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int PastaDientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int PapelHigenico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Desodorante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
