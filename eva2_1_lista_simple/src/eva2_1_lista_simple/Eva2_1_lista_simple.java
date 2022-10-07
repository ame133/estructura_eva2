
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
        System.out.println("cantidad de nodos: " + miLista.size());
        miLista.imprimir();
        try{
            miLista.insertarEn(70, 3);
        } catch (Exception ex){
            ex.printStackTrace();
        } 
        miLista.imprimir();
        System.out.println("cantidad de nodos: " + miLista.size());
        //miLista.deleteAll();
        //miLista.imprimir();
        try {
            miLista.delete1(0);
        } catch (Exception ex) {
            Logger.getLogger(Eva2_1_lista_simple.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.imprimir();
        System.out.println("cantidad de nodos: " + miLista.size());
        try {
            System.out.println("Valor en posicion 4: " + miLista.obtenValorEn(4));
        } catch (Exception ex) {
            Logger.getLogger(Eva2_1_lista_simple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
