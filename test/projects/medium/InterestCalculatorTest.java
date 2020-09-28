/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.medium;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;

/**
 * Test class for Interest Calculator problem
 * @author kward60
 */
@RunWith(Parameterized.class)
public class InterestCalculatorTest {
    
    private int amount;
    private float rate;
    private int comp;
    private int years;
    private InterestCalculator ic;
    
    public InterestCalculatorTest(int a, float r, int c, int y) {
        super();
        this.amount = a;
        this.rate = r;
        this.comp = c;
        this.years = y;
    }

    @Parameterized.Parameters
    public static Collection inputs()
    {
        //Generate and return test data
        return Arrays.asList(new Object[][] { {1000, 0.03f, 4, 1}, 
            {100000, 0.048f, 2, 2}, {5500, 0.056f, 12, 10}
        });
    }
    
    /**
     * Test of calculateInterest method, of class InterestCalculator.
     */
    @Test
    public void testCalculateInterest() {
        System.out.println("\ncalculateInterest");
        float expResult = (float) (amount * Math.pow((1 + rate/comp), comp * 1)); //Don't just copy and paste, that defeats the purpose.
        float result = InterestCalculator.calculateInterest(amount, rate, comp);
        
        System.out.println("Expected Result: " + expResult);
        System.out.println("Returned Result: " + result);
        assertTrue(expResult == result);
    }

    /**
     * Test of calcInterestYears method, of class InterestCalculator.
     */
    @Test
    public void testCalcInterestYears() {
        System.out.println("\ncalcInterestYears");
        float expResult = (float) (amount * Math.pow((1 + rate/comp), comp * years));;
        float result = InterestCalculator.calcInterestYears(amount, rate, comp, years);
        
        System.out.println("Expected Result: " + expResult);
        System.out.println("Returned Result: " + result);
        assertTrue(expResult == result);
    }
    
    public static void main(String[] args) {
         Result res = JUnitCore.runClasses(InterestCalculator.class);
         
         for(Failure fail : res.getFailures())
         {
             System.out.println(fail.toString());
         }
         System.out.println(res.wasSuccessful());
             
    }
    
}
