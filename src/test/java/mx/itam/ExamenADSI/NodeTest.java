package mx.itam.ExamenADSI;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void gus() {
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        n1.next = n2;
        n2.next = n3;

        Node n1_aux = n1.gus(); //Invertimos
        n1_aux = n1_aux.gus();  //Regresamos a lo normal
        assertEquals(n1_aux,n1); //Caso invierte toda completa
        assertEquals(n3.gus(),n3); //Caso invierte a si mismo
    }

    @Test
    public void prn_debug() {
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        n1.next = n2;
        n2.next = n3;
        Node n4 = null;
        assertEquals(n1.prn_debug(),"1-->2-->3-->"); //Caso completo
        assertEquals(n2.prn_debug(),"2-->3-->"); //Caso medio
        assertEquals(n3.prn_debug(),"3-->"); //Caso unico


    }
}