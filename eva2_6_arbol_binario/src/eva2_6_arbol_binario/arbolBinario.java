/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class arbolBinario {
    private nodo root;

    public arbolBinario(nodo root) {
        this.root = null;
    }
    
    //metodo publico para el usuario
    public void agregar(int valor){
        agregarRecursivo(valor, root);
        if (root == null) {
            root = new nodo(valor);
        }else{
            agregarRecursivo(valor, root);
        }
    }
    
    //metodo recursivo, necesita el valor y el nodo actual
    private void agregarRecursivo(int valor, nodo nodoActual){
        //el nodo recibido es null, el arbol está vacío
        
        //decidir si va a izq o derecha
        nodo nuevo = new nodo(valor);
        if (valor < nodoActual.getValor()) { //va a la izq
            if(nodoActual.getIzquierda() == null){
                nodoActual.setIzquierda(nuevo);
            }else
                agregarRecursivo(valor, nodoActual.getIzquierda());
            
        }else if(valor > nodoActual.getValor()){ //va a la derecha
            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevo);
            }else
                agregarRecursivo(valor, nodoActual.getDerecha());
        }else{//igual
            System.out.println("ELEMENTO REPETIDO"); 
        }   
    }
    public void inOrder(){
        inOrderRecu(root);
        System.out.println("");
    }
    private void inOrderRecu(nodo nodo){
        if (nodo != null) {
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }else{
            
        }
    }
    
    public void preOrden(){
            preOrdenRecu(root);
        System.out.println("");
        }
    private void preOrdenRecu(nodo nodo){
        if (nodo != null) {
            preOrdenRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            preOrdenRecu(nodo.getDerecha());
        }
    }
    public void posOrden(){
        posOrdenRecu(root);
        System.out.println("");
    }
    private void posOrdenRecu(nodo nodo){
        if (nodo != null) {
            posOrdenRecu(nodo.getIzquierda());
            posOrdenRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - ");           
        }
    }
}
