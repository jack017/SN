/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.nomina;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class CalculosTest {
    
    public CalculosTest() {
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
     * Test of Comision method, of class Calculos.
     */
    @Test
    public void testComision() {
        System.out.println("Comision");
        Calculos instance = new Calculos();
        double expResult = 0.0;
        double result = instance.Comision();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AuxT method, of class Calculos.
     */
    @Test
    public void testAuxT() {
        System.out.println("AuxT");
        double sueldo = 0.0;
        Calculos instance = new Calculos();
        double expResult = 0.0;
        double result = instance.AuxT(sueldo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaPe method, of class Calculos.
     */
    @Test
    public void testSaPe() {
        System.out.println("SaPe");
        double sueldo = 0.0;
        Calculos instance = new Calculos();
        double expResult = 0.0;
        double result = instance.SaPe(sueldo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
