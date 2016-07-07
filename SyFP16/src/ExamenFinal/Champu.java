
package ExamenFinal;


public class Champu implements Products{
    String name;
    String quantity;
    int noDeSerie;
    
 
    
    public Champu(String cName, String cQuantity, int cNoDeSerie){
        name = cName;
        quantity = cQuantity;
        noDeSerie = cNoDeSerie;
    }

    public void Products() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Champu() {
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
