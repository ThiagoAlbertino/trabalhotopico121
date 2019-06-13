/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.trabalhotopicos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class ClasseTesteTest {
    
    public ClasseTesteTest() {
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
     * Test of soma method, of class ClasseTeste.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int i = 1;
        int o = 1;
        ClasseTeste instance = new ClasseTeste();
        int expResult = 2;
        int result = instance.soma(i, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
