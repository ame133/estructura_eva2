/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_queue;

/**
 *
 * @author moviles
 */
public class Eva2_4_queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        //FIFO
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println("Primer valor en llegar: " + myQueue.peek());
        myQueue.imprimir();
        System.out.println("primer valor es: " + myQueue.poll());
        myQueue.imprimir();
    }
    
}
