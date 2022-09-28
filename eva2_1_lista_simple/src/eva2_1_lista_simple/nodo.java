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
public class nodo {
    private int valor;
    private nodo next;

    //POR DEFAULT UN NUEVO NODO VA AL FINAL DE LA LSITA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //NEXT SIEMPRE VA A SER NULL
    public nodo() {
        this.next = null; 
    }

    public nodo(int valor) {
        this.valor = valor;
        this.next = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }

}
