/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;
import java.awt.event.*;
/**
 *
 * @author immanuel
 */
public abstract class HijaPlacas implements IPlacas
{
    

    
    public String getHoyNoCircula(String ret) {
        System.out.println("Hoy no circulan los vehiculos con engomado color verde y terminacion 1 o 2");
        return "Hoy no circulan los vehiculos con engomado color verde y terminacion 1 o 2";
    }

    public String getByPlaca(String word,String day){
        if(word =="0"){
            System.out.println("viernes");
            return "viernes";
        }
        if(word == "9"){
            System.out.println("viernes");
            return "viernes";
        }
        if(word == "1"){
            System.out.println("jueves");
            return "jueves";
        }
        if(word == "2"){
            System.out.println ("jueves");
            return "jueves";            
        }
        if(word == "3"){
            System.out.println("miercoles");
            return "miercoles";
        }
        if(word == "4"){
            System.out.println("miercoles");
            return "miercoles";
        }
        if(word == "7"){
            System.out.println("martes");
            return "martes";
        }
        if(word == "8"){
            System.out.println("martes");
            return "martes";
        }
        if(word == "5"){
            System.out.println("lunes");
            return "lunes";
        }
        if(word == "6"){
            System.out.println("lunes");
            return "lunes";
        }
        else{
            return "0";
        }

    }

    
    public String getTerminacionPlaca(String day, String a) {
        if(day == "lunes"){
            return "5 y 6";
        }
        if(day == "martes"){
            return "7 y 8";
        }
        if(day == "miercoles"){
            return "3 y 4";
        }
        if(day == "jueves"){
            return "1 y 2";
            
        }
        if(day == "viernes"){
            return "9 y 0";
        }
        else{
            return "nada";
        }
        
    }

    
    public String getColor(String col) {
        if(col == "amarillo"){
            return "lunes";
        }
        if(col == "rosa"){
            return "marte";
        }    
        if(col == "rojo"){
            return "miercoles";
        }        
        if(col == "verde"){
            return "jueves";
        }
        if(col == "azul"){
            return "viernes";
        }
        else{
            return null;
        }
    
    
    }
    
    
   
}