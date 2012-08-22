/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ikimap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author holger
 */
public class SearchTest {
    
    public SearchTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of searchString method, of class Search.
     */
    @Test
    public void testSearchString() throws Exception {
        System.out.println("searchString");
        String searchTerm = "ruta";        
        String result = Search.searchString(searchTerm);
        assertFalse(result.isEmpty());        
    }
}
