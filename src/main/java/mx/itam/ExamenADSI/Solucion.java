package mx.itam.ExamenADSI;

import com.oracle.tools.packager.Log;

/**
 * Clase Solucion que tiene el metodo main usado.
 * Genera las lista de nodos y hace algunas transformaciones con ella
 */
public class Solucion {

    /**
     * COMENTARIO INCORRECTO:
     * <p>
     * Metodo que crea 6 Nodos cada uno con una letra diferente y
     * luego a cada uno en su propiedad next le asigna en siguiente.
     *
     * @return Node Regresa el primero que se creÃ³.
     */
    private Node build() {
        Log.debug("Creando nodos...");
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Log.debug("Nodos creados");
        return n1;
    }

    /**
     * Prueba la funcionalidad de el metodo "gus" con distintos casos de prueba
     */
    public void ok() {

        Node a = build();
        Log.debug("Imprimiendo Nodo A");
        a.prn();
        Log.debug("Volteando Nodo");
        a = a.gus();
        Log.debug("Imprimiendo Lista volteada");
        a.prn();
        Log.debug("Volteando Nodo");
        a = a.gus();
        Log.debug("Imprimiendo Lista volteada");
        a.prn();
        Log.debug("Creando nuevo Nodo");
        Node b = new Node("X");
        Log.debug("Volteando Nodo");
        b = b.gus();
        Log.debug("Imprimiendo nodo");
        b.prn();
        Log.debug("Creando nuevos nodos");
        Node c = new Node("X");
        Node d = new Node("Y");
        Log.debug("Relacionandolos");
        c.next = d;
        Log.debug("Invirtiendo el orden");
        c = c.gus();
        Log.debug("Imprimiendo");
        c.prn();
    }

    public static void main(String... argv) {
        new Solucion().ok();
    }

}

