/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author immanuel
 */
public class Main {
    public static void main(String[] args) {
        ArchivoTexto at = new ArchivoTexto();
        ArchivoBinario ab = new ArchivoBinario();
        ArchivoImagen ai = new ArchivoImagen();
        
        boolean resultado = at.abrirArchivo(1, 0);
        boolean resultado1 = at.archivoCerrar(1, 0);
        boolean resultado2 = at.desplegarArchivo(1, 0);
        
        boolean resultadoa1 = ab.abrirArchivo(1, 0);
        boolean resultadoa2 = ab.archivoCerrar(1, 0);
        boolean resultadoa3 = ab.desplegarArchivo(1, 0);
                
        boolean resultadob1 = ai.abrirArchivo(1, 0);
        boolean resultadob2 = ai.archivoCerrar(1, 0);
        boolean resultadob3 = ai.desplegarArchivo(0, 0)
    }
}
