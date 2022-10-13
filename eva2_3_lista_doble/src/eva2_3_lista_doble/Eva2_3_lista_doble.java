/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class Eva2_3_lista_doble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble =  new ListaDoble();
        listaDoble.add(10);
        listaDoble.add(20);
        listaDoble.add(30);
        listaDoble.add(40);
        listaDoble.imprimir();
        try {
            listaDoble.insertarEn(50, 2);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_3_lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
        try {
            listaDoble.delete1(1);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_3_lista_doble.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
    }
    
}
