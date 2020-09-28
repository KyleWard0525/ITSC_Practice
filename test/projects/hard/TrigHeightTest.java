/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.hard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TrigHeightTest {
    
    public TrigHeightTest() {
    }

    /**
     * Test of computeHeight method, of class TrigHeight.
     */
    @Test
    public void testComputeHeight() {
        System.out.println("computeHeight");
        double expResult = 4613.102920411071;
        double result = TrigHeight.computeHeight();
        
        System.out.println("Expected Result: " + expResult);
        System.out.println("Actual Result: " + result);
        assertTrue(result == expResult);
    }
    
}
