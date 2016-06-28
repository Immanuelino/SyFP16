/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author immanuel
 */
public class AbstractTableModel11 extends AbstractTableModel {
    String[][] m;
   
    public AbstractTableModel11(String loquesea) throws IOException {
        int i = 0;
        
        m= new String[101][6];
        
        BufferedReader br = null;
        
        String row[];
        
        try{
            br = new BufferedReader(new FileReader(loquesea));
            String linea = br.readLine();
            while(linea != null){
                row = linea.split(","); //split permite que se separen las columnas
                linea = br.readLine();
                m[i]=row;
                i = i + 1;
                
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Archivo no se encuentra disponible");
            
        }
        finally{
            
        }
        
        
        
    }

   

    @Override
    public int getRowCount() {
        return 101;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    
}
