/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class Eva2_1_lista_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lista miLista = new lista();
        /*int [] arreglo = new int [1000000];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 1000;
        }*/
        //miLista.imprimir();
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);
        miLista.add(60);
        miLista.imprimir();
        try{
            miLista.insertarEn(70, 3);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
        miLista.imprimir();
        //miLista.deleteAll();
        //miLista.imprimir();
        try {
            miLista.delete1(0);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_1_lista_simple.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimir();
    }  
}
