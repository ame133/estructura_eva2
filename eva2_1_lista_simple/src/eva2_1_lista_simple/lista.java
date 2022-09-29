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
    private nodo fin;

    //POR DEFAULT LA LISTA ESTA VACIA
    public lista() {
        this.inicio = null; // NO HAY NODOS EN LA LISTA
        this.fin = null;
    }
    public void imprimir(){
        nodo temp = inicio;
            //movemos a temp con un ciclo 
            while(temp != null){
                System.out.print(temp.getValor() + " - ");
                temp = temp.getNext();
            }
    }
    //AGREGAR UN NODO AL FINAL DE LA LISTA
    public void add(int valor){
        nodo newNodo = new nodo(valor);
        
        //VERIFICAR SI HAY NODOS EN LA LSITA
        if (inicio == null) { //NO HAY NODOS EN LA LISTA 
            inicio = newNodo;
            fin = newNodo;
        }else{ // hay nodos en la lista
           //hay que movernos por la lista
            //usando un nodo temporal hasta llegar al ultimo nodo
            /*nodo temp = inicio;
            //movemos a temp con un ciclo 
            
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNodo);*/
            
            fin.setNext(newNodo);
            fin = newNodo;
        }
    }
    public int size(){
        int cont = 0;
        nodo temp = inicio;
            //movemos a temp con un ciclo 
            while(temp != null){
                cont++;
                temp = temp.getNext();
            }
            return cont;
    }
    public void agregarEn(int valor, int pos) {
        //
        
    }
}
