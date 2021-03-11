/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.oop.inheritance;

/**
 *
 * This is the Vehicle parent class
 * 
 * @author kward60
 */
public class Vehicle {
    
    //Class variables that will be accessible to any child(sub)class
    protected double gallonsPerTank;
    protected double mpg;
    
    /**
     * Default constructor
     */
    public Vehicle()
    {
        this.gallonsPerTank = 0.0;
        this.mpg = 0.0;
    }

    public double getGallonsPerTank() {
        return gallonsPerTank;
    }

    public double getMpg() {
        return mpg;
    }
    
    public double getRange()
    {
      return gallonsPerTank * mpg;
    }
    
}
