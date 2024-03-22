package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Delimitadores objDel;
    static Pila<Integer> pila;
    

    @BeforeAll public static void setUp() {
        objDel = new Delimitadores();
        pila = new Pila<Integer>();
        
    }

    @Test public void testEvaluacionExitosa(){
        
        String expr= "while (m<(n[8]+o)) { "+
                     "int p=7; "+
                     "/*comentarios*/"+
                     "               }";
        boolean resultado=objDel.evaluacionDelimitadores(expr);
        System.out.println(resultado);
        assertTrue(resultado,"Debe ser verdadero");

    }

    @Test public void testEvaluacionFallida(){
        String expr = "(a+b)*2/5(";
        boolean resultado=objDel.evaluacionDelimitadores(expr);
        System.out.println(resultado);
        assertFalse(resultado,"Debe ser verdadero");

    }
    @Test public void testInfijaPrefija(){
        String expresionInfija = "a + b * c";//expresión valida
		String expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
        String expresionEsperada = "abc*+";
        assertTrue(expresionPrefijo.equals(expresionEsperada));

        expresionInfija = "(a + b) * c"; //expresión valida
        expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
        expresionEsperada = "ab+c*";
        assertTrue(expresionPrefijo.equals(expresionEsperada));

        expresionInfija = "(a + (e+z)+b) * c"; //expresión valida
        expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
        expresionEsperada = "aez++b+c*";
        assertTrue(expresionPrefijo.equals(expresionEsperada));

        expresionInfija = "(a + (e+z)/b) * c"; //expresión valida
        expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
        expresionEsperada = "aez+b/+c*";
        assertTrue(expresionPrefijo.equals(expresionEsperada));

        expresionInfija = "(X + Z) * W / T ^ Y - V"; //expresión valida
        expresionPrefijo = InfijaPrefija.convertirAPrefijo(expresionInfija);
        expresionEsperada = "XZ+W*TY^/V-";
        assertTrue(expresionPrefijo.equals(expresionEsperada));

    }
    @Test public void testBuscarPila(){
       
        pila.apilar(20);
        pila.apilar(50);
        pila.apilar(70);

        int resultado = pila.buscar(20);
        assertEquals(2,resultado);
        
        resultado = pila.buscar(50);
        assertEquals(1,resultado);
        
        resultado = pila.buscar(70);
        assertEquals(0,resultado);
       
        resultado = pila.buscar(2);
        assertEquals(-1,resultado);

        pila.retirar();

        resultado = pila.buscar(50);
        assertEquals(0,resultado);
        

    }
   
}