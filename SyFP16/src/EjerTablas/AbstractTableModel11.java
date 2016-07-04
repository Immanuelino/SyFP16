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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author immanuel
 */
public class AbstractTableModel11 extends AbstractTableModel {
    String nombreArchivo;
    public int contRenglon()
    {
        BufferedReader br1 = null;
        String row[];
        i = 0;
        String linea;
 
 
 
       
        try
        {           
           
            
            br1 = new BufferedReader(new FileReader(nombreArchivo));
            linea = br1.readLine();
            while(linea != null){
                i = i + 1;
                linea = br1.readLine();
            }
        }
        
        catch (IOException ex) {
            System.out.println("Error: no lee");
        }
        return i;
    }
    
    public int contColumna()
    {
        BufferedReader l = null;
        String linea;
        String column[];
        try{
            l= new BufferedReader(new FileReader(nombreArchivo));
            linea = l.readLine();
            column = linea.split(",");
            i = column.length;
        } catch (IOException ex) {
            System.out.println("Error: no lee columna");
        }
        return i;
        
    }
    int i = 0;
    String row[];
    
    
    String[][] m;
   
    public AbstractTableModel11(String loquesea) throws IOException {
        nombreArchivo = loquesea;
        BufferedReader br = null;
        int i = 0;
        m= new String[contRenglon()][contColumna()];
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
        
        
        
        
        
        
    }

   

    @Override
    public int getRowCount() {
        return contRenglon();
    }

    @Override
    public int getColumnCount() {
        return contColumna();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    
}
