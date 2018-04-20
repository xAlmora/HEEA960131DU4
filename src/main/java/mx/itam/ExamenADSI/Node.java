package mx.itam.ExamenADSI;
/**
 * Clase Nodo que permite hacer una lista ligada a otros nodos e imprimir el dato que guardan en forma secuencial
 *
 */
public class Node {
    String data;
    Node next;

    /**
     * Genera un nuevo nodo para guardar un String
     * @param data String que guarda el nodo
     */
    Node(String data) {
        this.data = data;
    }
    /**
     * Invierte la secuencia de Nodos que componen a esta lista. Por ejemplo
     * A -> B -> C
     * La transforma en:
     * C -> B -> A
     * @return Node : nodo Inicial de la lista
    */
    Node gus() {
        if (next == null) return this; //Si este es el ultimo nodo (no tiene next) regresamos este
        Node otro = next; //Guardamos el nodo siguiente
        next = null; //Rompemos la relacion con el nodo siguiente
        Node tavo = otro.gus(); //a nuestro nodo siguiente lo llamamos y aplicamos el gus
        otro.next = this; //asignamos a nuestro nodo siguiente relacion con este nodo
        return tavo; //regresamos el nodo siguiente (en recursion, el ultimo nodo de nuestra lista)
    }

    /**
     * Imprime en la consola la secuencia de Nodos que
     * componen a esta lista. Por ejemplo, para la lista
     * que devuelve el mÃ©todo "build", la invocaciÃ³n de
     * este mÃ©todo escribe en la consola:
     * <p>
     * A-->B-->C-->D-->E-->F-->
     * <p>
     * Lo anterior serÃ­a lo que se visualiza en la consola
     * justo despuÃ©s de ejecutar las siguintes dos lineas:
     * <p>
     * Node a = build();
     * a.prn();
     */
    public void  prn() {
        Node node_actual = this;
        while(node_actual!=null){
            System.out.print(node_actual.data+"-->");
            node_actual = node_actual.next;
        }
    }

    /**
     * Funcion para probar en Test prn()
     * @return String que imprime prn()
     */
    public String prn_debug(){
        Node node_actual = this;
        StringBuilder sb = new StringBuilder();
        while(node_actual!=null){
            sb.append(node_actual.data+"-->");
            node_actual = node_actual.next;
        }
        return sb.toString();
    }
}
