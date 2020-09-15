/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.io.solutions;

import projects.io.*;

/**
 * For this practice project, print
 * every number between min and max
 * counting by 2
 * 
 * @author ztw21
 */
public class CountByTwo_ztw21 {
    
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        
        int count;
        for(count=min;count<=max;count+=2){
            System.out.println(count);
        }
    }
    
}
