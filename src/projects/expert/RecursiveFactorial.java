/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.expert;

/**
 *
 * In this problem you will use recursion (calling a function within itself)
 * in order to compute the factorial of the integer passed in.
 * 
 * 
 * 
 * HINT:
 *  - Recursive functions require a "base case" which is essential,
 * when you want your function to stop
 * - If the base case isn't reached, recursion continues
 * 
 * Since this problem is on the more 'advanced' side,
 * I've provided some useful comments to get you started
 * 
 * 
 * @author kward60
 */
public class RecursiveFactorial {
    
    public long factorial(int n)
    {
        /*
        Base case is the first thing to check for in a 
        recursive function. Think about the nature of this problem.
        At what point would you want you function to stop?
        
        if(n == ?)
        {
          return ?;
        }
        */
        
        /*
        The line below is the recursive part of this method.
        Notice the method is calling itself, but the value being
        passed in is incorrect. Again, think about the nature of 
        factorials and how they're computed. What should you be passing in?
        */
        return n * factorial(n);
    }
    
}
