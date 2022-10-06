package eva2_1_lista_simple;

public class lista {
    private nodo inicio;
    private nodo fin;

    //POR DEFAULT LA LISTA ESTA VACIA
    public lista() {
        this.inicio = null; // NO HAY NODOS EN LA LISTA
        this.fin = null;
    }
    public void imprimir(){
        if (inicio == null) {
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
    public void insertarEn(int valor, int pos) throws Exception{
        //
        int canNodos = size();
        if (pos < 0) {
            throw new Exception("No puede insertar una posicion negativa");
        }else if(pos >= canNodos){
            throw new Exception (pos + " no es una posicion valida en la lista");
        }else{
            nodo newNodo = new nodo(valor);
            if (pos == 0) { //insertar al inicio de la lista
                newNodo.setNext(inicio);
                inicio = newNodo;
            }else{
                nodo temp = inicio;
                int cont =0;
                //movemos a temp con un ciclo 
                while(cont < pos-1){
                    temp = temp.getNext();
                    cont ++;
                }
                //System.out.println(temp.getValor() + " - ");
                newNodo.setNext(temp.getNext());
                temp.setNext(newNodo);
            }
        }
    }
    public void deleteAll(){
        inicio = null;
        fin = null;
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
                    if (pos == (canNodos- 1)) { // reconectar a fin si se elimina el ultimo nodo
                        fin = temp;
                    }
                }
            }
        }
    }
    public int obtenValorEn(int pos) throws Exception{
        int canNodos = size();
        if (pos < 0) {
            throw new Exception("No puede insertar una posicion negativa");
        }else if(pos >= canNodos){
            throw new Exception (pos + " no es una posicion valida en la lista");  
        }else{
            
        }
    }
}

