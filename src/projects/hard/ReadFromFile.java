/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.hard;

import java.io.*;
import java.util.*;

/**
 *
 * In this problem you're tasked with reading in a
 * list of names from "names.txt". Store the names in an 
 * ArrayList in the order in which they appear and return
 * said ArrayList
 * 
 *
 * There are multiple ways to read data from a file, the method you 
 * choose is up to you. Although, I personally prefer using the 
 * BufferedReader class which can be found at java.io.BufferedReader;
 * 
 * 
 * All the necessary imports have been included for you.
 * I highly recommend using/reading javadocs for this problem. 
 * 
 * @author kward60
 */
public class ReadFromFile {
    
    public ArrayList<String> readFromFile()
    {
        ArrayList<String> names = new ArrayList<String>();
        
        //File object provided for you
        File f = new File(System.getProperty("user.dir") + "/src/projects/names.txt");
        
        //Your code here
        
        
        
        return names;
    }
    
}
