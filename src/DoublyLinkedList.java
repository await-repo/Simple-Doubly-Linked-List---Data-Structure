public class DoublyLinkedList {

    /*El nodo header sirve como referencia ya que estara siempre al inicio de la lista*/
    Node header = null;
    /*El nodo last sirve como referencia ya que estara siempre al final de la lista*/
    Node last = null;
    int size;

    DoublyLinkedList() {
        size = 0;
    }

    boolean isEmpty(){
        return header == null;
    }

    /*Buscamos el Nodo last y agregamos el nuevo Nodo al final de la lista, ahora el Nodo node
    sera el ultimo nodo de la lista*/
    void add(int number){
        Node node = new Node(number);

        if ( isEmpty() ){
            node.prev = node.next = null;
            header = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    /*Muestra la lista empezando desde el inicio de la lista*/
    void show(){
        for (Node node = header; node != null; node = node.next)
            System.out.println( node.getNumber() );
    }

    /*Muestra la lista empezando desde el final de la lista*/
    void showInverse () {
        for (Node node = last; node != null; node = node.prev)
            System.out.println( node.getNumber() );
    }

    /*Buscamos el nodo ingresado como parametro, si existe el nodo los retornamos, sino existe
    simplemente retornamos null*/
    Node search(int number){
        for (Node node = header; node != null; node = node.next)
            if (number == node.number)
                return node;

        return null;
    }

    /*Delete es un metodo que elimina el nodo que coincida con el numero, elimina todos los nodos con el
    mismo valor numerico*/
    void delete (int number) {

        /*Si existe el mismo numero al inicio de la lista se eliminara hasta que no este en el nodo Head*/
        while (header.number == number)
            deleteFirst();

        /*Si existe el mismo numero al final de la lista se eliminara hasta que no este en el nodo Last*/
        while (last.number == number)
            deleteLast();

        /*Si el nodo esta en medio de la lista (no es el primer ni ultimo nodo) entonces eliminara todos los
        repetidos que esten en medio de la lista*/
        for (Node aux = header; aux != last; aux = aux.next)
            while(aux.next.number == number) {
                aux.next = aux.next.next;
                aux.next.prev = aux;
                size--;
            }

    }

    /*Elimina el nodo que este al inicio de la lista*/
    void deleteFirst () {
        if (isValid()) {
            header = header.next;
            header.prev = null;
            size--;
        }
    }

    /*Elimina el nodo que este al final de la lista*/
    void deleteLast () {
        if (isValid()){
            last = last.prev;
            last.next = null;
            size--;
        }
    }

    /*Metodo isValid () Igual en todos*/
    boolean isValid () {
        if ( isEmpty() ){
            System.out.println("List Empty");
        } else if (header == last){
            header = last = null;
            size = 0;
        }
        return header != null;
    }

    /*Retorna el tamaño de la lista*/
    int getSize () {
        return size;
    }

}
