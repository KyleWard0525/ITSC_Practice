/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.oop.inheritance;

/**
 * The Car class is a child class of the Vehicle class
 * 
 * 1. Complete setGallonsPerTank()
 * 2. Complete setMpg()
 * 3. Complete toString()
 * 
 * 
 * 
 * @author kward60
 */
public class Car extends Vehicle {
    
    private String model;
    private int year;
    private int numCylinders;
    
    /**
     * Default constructor
     */
    public Car()
    {
        super(); //Call to parent class
        this.model = "";
        this.year = 0;
        this.numCylinders = 0;
        
    }
    
    /**
     * Main constructor
     */
    public Car(String model, int year, int numCylinders)
    {
        super();
        this.model = model;
        this.year = year;
        this.numCylinders = numCylinders;
    }
    
    /**
     * Set the value of the Car's gallonsPerTank
     */
    public void setGallonsPerTank(double gpt)
    {
        //Set gallonsPerTank 
        //HINT: What keyword is used to access a parent class?
        
        //Your code here
        
    }
    
    /**
     * Set the value of the Car's gallonsPerTank
     */
    public void setMpg(double mpg)
    {
        //Set gallonsPerTank 
        //HINT: What keyword is used to access a parent class?
        
        //Your code here
        
    }

    @Override
    public String toString() {
        
        /**
         * INSERT THE CORRECT VALUES INTO THE PLACES LABELED BELOW
         * While not necessary, I recommend accessing the values through the getter methods
         * That way you can see how you can access parent class methods as well as fields (public or protected)
         */
        
        return "\nCar {" + " model = " + model + ", year = " + year + ", numCylinders = " + numCylinders + 
                ", gallonsPerTank = " + "INSERT VALUE HERE" + ", mpg = " + "INSERT VALUE HERE" + ", range = " +
                "INSERT VALUE HERE" + "}\n";
        
    }
    
    
    
}
