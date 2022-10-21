/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_stack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moviles
 */
public class Eva2_5_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.imprimir();
        System.out.println("CIMA DE LA PILA: " + myStack.peek());
        myStack.imprimir();
        try {
            System.out.println("CIMA DE LA PILA: " + myStack.pop());
        } catch (Exception ex) {
            Logger.getLogger(Eva2_5_stack.class.getName()).log(Level.SEVERE, null, ex);
        }
        myStack.imprimir();
    }
    
}
