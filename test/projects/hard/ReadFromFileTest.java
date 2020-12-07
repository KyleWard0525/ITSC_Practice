/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.hard;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ReadFromFileTest {
    
    public ReadFromFileTest() {
    }

    /**
     * Test of readFromFile method, of class ReadFromFile.
     */
    @Test
    public void testReadFromFile() {
        System.out.println("readFromFile");
        ReadFromFile instance = new ReadFromFile();
        ArrayList<String> expResult = rfr();
        ArrayList<String> result = instance.readFromFile();
        
        assertEquals(expResult, result);
        
    }
    
    
    private ArrayList<String> rfr()
    {
        ArrayList<String> data = new ArrayList<>();
        File f = new File(System.getProperty("user.dir") + "/src/projects/names.txt");
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String name = "";
            while ((name = br.readLine()) != null)
            {
             data.add(name);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFromFileTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFromFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return data;
    }
}
