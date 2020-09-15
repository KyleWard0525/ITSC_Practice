/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.medium;

/**
 * In this project you are tasked with making
 * an interest calculator for a banking system
 * that calculates a client's annual earnings given
 * the initial deposit, rate of interest, and number of 
 * times its compounded per year.
 * 
 * Interest Formula:
 * 
 * A = P(1 + r/n)^(nt)
 * 
 * P = initial amount
 * r = interest rate
 * n = # of times compounded per year
 * t = number of years
 * 
 * 
 * I've also included a skeleton method to calculate 
 * a client's interest using the global variables and
 * the number of years passed in. Give it a shot if you 
 * think you can!
 * 
 * @author kward60
 */
public class InterestCalculator {
    
    private final int DEPOSIT = 100000;
    private final float RATE = 0; // ERROR: This rate should be 4.8%
    private final int N = 2;
    
    /**
     * Find the client's return after 1 year given the 3
     * parameter
     * 
     * @param amount - initial deposit
     * @param rate - interest rate
     * @param comp - number of times compounded per year
     * @return - client's total balance
     */
    public float calculateInterest(int amount, float rate, int comp)
    {
        float finalAmount = 0;
        
        
        //Your solution here
        
        
        return finalAmount;
    }
    
    /**
     * Calculate client's return given the global
     * variables and years
     * 
     * @param years - number of years the deposit will be invested
     * @return - client's total balance
     */
    public float calcInterestYears(int years)
    {
        float finalAmount = 0;
        
        
        //Your solution here
        
        
        return finalAmount;
    }
    
    
    
}
