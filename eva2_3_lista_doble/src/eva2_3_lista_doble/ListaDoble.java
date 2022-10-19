
package eva2_3_lista_doble;

/**
 *
 * @author moviles
 */
public class ListaDoble {
    private nodo inicio;
    private nodo fin;
    private int cont;
    
        public ListaDoble() {
        this.inicio = null; // NO HAY NODOS EN LA LISTA
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if (inicio == null) 
            return true;
        else
            return false;
    }
    
    public void imprimir(){
        if (listaVacia()) {
            System.out.println("LISTA VACIA");
        }else{
        nodo temp = inicio;
            //movemos a temp con un ciclo 
            while(temp != null){
                System.out.print(temp.getValor() + " - ");
                temp = temp.getNext();
            }
            System.out.println("");
        }  
    }
    
    public int size(){
            return this.cont;
    }
    public void add(int valor){
        nodo newNodo = new nodo(valor);       
        if (inicio == null) { 
            inicio = newNodo;
            fin = newNodo;
        }else{ 
            fin.setNext(newNodo);
            newNodo.setPrevio(fin);
            fin = newNodo;
        }
        cont++;
    }
    public void deleteAll(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    public void insertarEn(int valor, int pos) throws Exception{
        //
        int canNodos = size();
        if (pos < 0) {
            throw new Exception("No puede insertar una posicion negativa");
        }else if(pos >= canNodos){
            throw new Exception (pos + " No es una posicion valida en la lista");
        }else{
            nodo newNodo = new nodo(valor);
            if (pos == 0) { //insertar al inicio de la lista
                newNodo.setNext(inicio);
                inicio.setPrevio(newNodo);
                inicio = newNodo;
            }else{
                nodo temp = inicio;
                int cont =0;
                //movemos a temp con un ciclo 
                while(cont < pos){
                    temp = temp.getNext();
                    cont ++;
                }
                //System.out.println(temp.getValor() + " - ");
                newNodo.setNext(temp);
                newNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setNext(newNodo);
                temp.setPrevio(newNodo);
                
            }
        }
        this.cont++;
    }
    public void delete1(int pos)throws Exception{
        int canNodos = size();
        if (pos < 0) {
            throw new Exception("No puede insertar una posicion negativa");
        }else if(pos >= canNodos){
            throw new Exception (pos + " no es una posicion valida en la lista");
        }else{
            //BORRAR EL PRIMER NODO SI SOLO HAY UN NODO
            if (canNodos == 1) {
                deleteAll();
            }else{ //eliminar el primer nodo cuando hay mas de 1 nodo en la lista
                if (pos == 0) {
                    inicio = inicio.getNext();
                    
                }else{//borrar una posicion intermedia
                    nodo temp = inicio;
                int cont =0;
                //movemos a temp con un ciclo 
                    while(cont < pos-1){
                        temp = temp.getNext();
                        cont ++;
                    }
                    temp.setNext(temp.getNext().getNext()); 
                    temp.setPrevio(temp.getPrevio());
                    if (pos == (canNodos- 1)) { // reconectar a fin si se elimina el ultimo nodo
                        fin = temp;
                    }
                }
                this.cont--;
            }
        }
    }
}
