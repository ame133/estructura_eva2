package eva2_6_arbol_binario;

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
    private nodo derecha;
    private nodo izquierda;

    //POR DEFAULT UN NUEVO NODO VA AL FINAL DE LA LSITA
    //EL FINAL DE LA LISTA SE INDICA CON NULL
    //NEXT SIEMPRE VA A SER NULL
    public nodo() {
        this.derecha = null; 
        this.izquierda = null;
    }

    public nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(nodo derecha) {
        this.derecha = derecha;
    }

    public nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodo izquierda) {
        this.izquierda = izquierda;
    }

    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    
}
