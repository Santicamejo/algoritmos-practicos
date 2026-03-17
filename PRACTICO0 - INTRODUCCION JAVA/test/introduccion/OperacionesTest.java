/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package introduccion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sm116
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int x = 2;
        int y = 10;
        Operaciones instance = new Operaciones();
        /** Defino el resultado que estoy esperando, en el tipo de dato que estoy esperando **/
        int expResult = 12;
        Retorno result = instance.sumar(x, y);
        
        /** Decoro un poco la salida de la informacion **/
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result.valorEntero);
        
        /** Aca compraro el expResultado que es del tipo de dato que defina con el result y el atributo del tipo de dato que necesite **/
        assertEquals(expResult, result.valorEntero);
    }

    /**
     * Test of restar method, of class Operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int x = 10;
        int y = 2;
        Operaciones instance = new Operaciones();
        int expResult = 8;
        Retorno result = instance.restar(x, y);
        
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result.valorEntero);
        
        assertEquals(expResult, result.valorEntero);
    }

    /**
     * Test of dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int x = 25;
        int y = 5;
        Operaciones instance = new Operaciones();
        int expResult = 5;
        Retorno result = instance.dividir(x, y);
        
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result.valorEntero);
        
        assertEquals(expResult, result.valorEntero);
    }

    /**
     * Test of multiplicar method, of class Operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int x = 5;
        int y = 5;
        Operaciones instance = new Operaciones();
        int expResult = 25;
        Retorno result = instance.multiplicar(x, y);
                
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result.valorEntero);
             
        assertEquals(expResult, result.valorEntero);
    }

    /**
     * Test of esMayor method, of class Operaciones.
     */
    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        int x = 10;
        int y = 5;
        Operaciones instance = new Operaciones();
        boolean expResult = true;
        Retorno result = instance.esMayor(x, y);
                 
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result.valorbooleano);
                    
        assertEquals(expResult, result.valorbooleano);
    }
    
}
