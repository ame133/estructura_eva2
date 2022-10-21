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
    }
    
    //metodo recursivo, necesita el valor y el nodo actual
    private void agregarRecursivo(int valor, nodo nodoActual){
        
    }
}
