/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author immanuel
 */
public class Archivos 
{
    public void escribir() throws IOException{//throws: el metodo no se manipula, throw: new metodo, genera una excepcion nueva
        BufferedWriter bw = null;
        bw = new BufferedWriter(new FileWriter("ejemplo.txt", true));
        bw.write("van a pasar");
        bw.close();
        
                
    }
    public void leer() throws IOException
    {
        BufferedReader br = null;
        try
        {
            
            br = new BufferedReader(new FileReader("ejemplo.txt"));
            String linea;
            linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("archivo no encontrado");
        }
        catch(IOException e){
            System.out.println("Cannot find text");
        }
        finally{
            br.close();
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        Archivos a = new Archivos();
        a.leer();
        a.escribir();
        
    }
}
