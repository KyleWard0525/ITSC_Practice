/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.expert;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kward60
 */
public class RecursiveFactorialTest {
    
    public RecursiveFactorialTest() {
    }

    @Test
    public void testSomeMethod() {
        RecursiveFactorial rf = new RecursiveFactorial();
        int[] params = {1, 3, 5, 7, 9, 12, 15, 20};
        long[] ans = {1, 6, 120, 5040, 362880, 479001600, 1307674368000L, 2432902008176640000L};
        
        for(int i = 0; i < params.length; i++)
        {
            assertEquals(ans[i], rf.factorial(params[i]));
        }
        System.out.println("All tests passed!");
    }
    
}
