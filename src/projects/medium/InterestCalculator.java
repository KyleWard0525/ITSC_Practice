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
 * @author kward60
 */
public class InterestCalculator {
    
    /**
     * Find the client's return after 1 year given the 3
     * parameter
     * 
     * @param amount - initial deposit
     * @param rate - interest rate
     * @param comp - number of times compounded per year
     * @return - client's total balance
     */
    public static float calculateInterest(int amount, float rate, int comp)
    {
        float finalAmount = 0;
        
        
        //Your solution here
        finalAmount = (float) (amount * Math.pow((1 + rate/comp), comp * 1));
        
        return finalAmount;
    }
    
    /**
     * Calculate client's return given all variables
     * 
     * @param years - number of years the deposit will be invested
     * @return - client's total balance
     */
    public static float calcInterestYears(int p, float r, int n, int t)
    {
        float finalAmount = 0;
        
        
        //Your solution here
        finalAmount = finalAmount = (float) (p * Math.pow((1 + r/n), n * t));
        
        return finalAmount;
    }
    
    /**
     * Main driver code
     * @param args 
     */
    public static void main(String[] args) {
       
    }
    
}
