/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ArraySortTest {

    private final Random rand = new Random();

    public ArraySortTest() {
    }

    /**
     * Test of sort method, of class ArraySort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        ArrayList<int[]> arrays = new ArrayList<>();
        ArraySort as = new ArraySort();


        //RUN TESTS
        for (int i = 0; i < 10; i++) {

            //Create random int arrarys
            for (int k = 0; k < 10; k++) {
                int[] arr = new int[10];

                //Fill arr with random values
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = rand.nextInt(1000);
                }
                
                arrays.add(arr);
            }
           
           assertTrue(isSorted(as.sort(arrays.get(i))));
            
        }
    }
    
    boolean isSorted(int[] arr)
    {
        boolean sorted = false;
        
            for(int n = 0; n < arr.length-1; n++)
            {
                if(arr[n] <= arr[n+1])
                {
                    sorted = true;
                } else {
                    sorted = false;
                }
            }
        return sorted;
    }

}
