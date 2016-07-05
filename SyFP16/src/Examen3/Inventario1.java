/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author immanuel
 */
public class Inventario1 extends AbstractTableModel{
    
    String id;
    String producto;
    int total;
    
    String column[];
    String nomArchivo;
    int j;
    ArrayList row = new ArrayList();
    
    BufferedReader n1 = null;
    
    public int contarFrame(){
        
        String row[];
        String column[];
        int i = 0;     
        String linea;
        
        
        
     
        
        try{
            new BufferedReader(new FileReader("products.csv"));
            linea = n1.readLine();
            while(linea != null)
            {
                linea = n1.readLine();
                String[] row1 = linea.split(";");
                
                
                if(row1[0].equals ("FRAME"))
                {
                    i = i++;
                }
                
            }
        }
        catch (IOException ex) {
            System.out.println("Error: no lee");
        }
        return i;
        
        public int contarGlue(){

                String row[];
                String column[];
                int i = 0;     
                String linea;





                try{
                    new BufferedReader(new FileReader("products.csv"));
                    linea = n1.readLine();
                    while(linea != null)
                    {
                        linea = n1.readLine();
                        String[] row1 = linea.split(";");


                        if(row1[4].equals ("FRAME"))
                        {
                            i = i++;
                        }

                    }
                }
                catch (IOException ex) {
                    System.out.println("Error: no lee");
                }
                return i;







        
        
        
        
        
        
        
        
        
        
        
        
    
   
    
    

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
