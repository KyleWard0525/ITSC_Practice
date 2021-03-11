/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.oop;

/**
 *
 * This is the Vehicle parent class
 * 
 * @author kward60
 */
public class Vehicle {
    
    //Class variables that will be accessible to any child(sub)class
    private double gallonsPerTank;
    private double mpg;
    private double range;
    
    /**
     * Default constructor
     */
    public Vehicle()
    {
        this.gallonsPerTank = 0.0;
        this.mpg = 0.0;
        this.range = 0.0;
    }
    
    /**
     * Main constructor
     */
    public Vehicle(double gpt, double mpg)
    {
        this.gallonsPerTank = gpt;
        this.mpg = mpg;
        this.range = 0.0;
    }
    
    /**
     * Calculate the total range in miles for the vehicle
     * 
     * Hint: You have X gallons of fuel and you get Y miles to the gallon,
     *       find, X*Y
     * 
     * @return 
     */
    public double getRange()
    {
        //YOUR CODE GOES HERE
        
        
        return 0;
    }
    
}
