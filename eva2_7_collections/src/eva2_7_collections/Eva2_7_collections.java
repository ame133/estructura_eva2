/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author moviles
 */
public class Eva2_7_collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lista
        System.out.println("LINKED LIST");
        LinkedList listaEnlazada = new LinkedList();
        listaEnlazada.add("hola");
        listaEnlazada.add(" ");
        listaEnlazada.add("mundo");
        listaEnlazada.add("!!");
        System.out.println(listaEnlazada);
        System.out.println(listaEnlazada.get(0));
        listaEnlazada.remove(0);
        System.out.println(listaEnlazada);
        listaEnlazada.addFirst("hola");
        System.out.println(listaEnlazada);
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.print(listaEnlazada.get(i));
        }
        
        //arraylist
        System.out.println("");
        System.out.println("ARRAYLIST");
        ArrayList <Integer>  arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        System.out.println(arrayList);
        arrayList.add(2,250);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        //queue
        //stack
        //conjuntos
    }
    
}
