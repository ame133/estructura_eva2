package eva2_1_lista_simple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class lista {
    private nodo inicio;

    //POR DEFAULT LA LISTA ESTA VACIA
    public lista() {
        this.inicio = null; // NO HAY NODOS EN LA LISTA
    }
    public void imprimir(){
        nodo temp = inicio;
            //movemos a temp con un ciclo 
            while(temp.getNext() != null){
                System.out.println(temp.getValor() + " - ");
                temp = temp.getNext();
            }
    }
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(int valor){
        nodo newNodo = new nodo(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LSITA
        if (inicio == null) { //NO HAY NODOS EN LA LISTA 
            inicio = newNodo;
        }else{ // hay nodos en la lista
           //hay que movernos por la lista
            //usando un nodo temporal hasta llegar al ultimo nodo
            nodo temp = inicio;
            //movemos a temp con un ciclo 
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNodo);
        }
    }
}
