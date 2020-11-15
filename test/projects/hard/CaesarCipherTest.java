/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.hard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CaesarCipherTest {
    
    public CaesarCipherTest() {
    }

    /**
     * Test of encrypt method, of class CaesarCipher.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String[] tests = {"hello", "the manhattan project was an inside job", "apples are red", "life is pain"};
        int shift = 5;
        CaesarCipher cc = new CaesarCipher();
        assertEquals(enc(tests[0],shift), cc.encrypt(tests[0], shift));
        assertEquals(enc(tests[1],shift), cc.encrypt(tests[1], shift));
        assertEquals(enc(tests[2],shift), cc.encrypt(tests[2], shift));
        assertEquals(enc(tests[3],shift), cc.encrypt(tests[3], shift));
    }

    /**
     * Test of decrypt method, of class CaesarCipher.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String[] tests = {"hello", "the manhattan project was an inside job", "apples are red", "life is pain"};
        int shift = 5;
        CaesarCipher cc = new CaesarCipher();
        String[] encrypted = new String[tests.length];
        int count = 0;
        
        for(String s : tests)
        {
            encrypted[count] = enc(s,shift);
        }
        
        assertEquals(dec(encrypted[0],shift), cc.decrypt(encrypted[0], shift));
        assertEquals(dec(encrypted[1],shift), cc.decrypt(encrypted[1], shift));
        assertEquals(dec(encrypted[2],shift), cc.decrypt(encrypted[2], shift));
        assertEquals(dec(encrypted[3],shift), cc.decrypt(encrypted[3], shift));
    }
    
    
    private String enc(String msg, int shift)
    {
        
        String[] strArr = msg.split("");
        String encrypted = "";
        
        for(String s : strArr)
        {
            if(!s.equals(" "))
            {
            int origPos = s.charAt(0) - 'a';
            int newPos = (origPos + shift) % 26;
            encrypted += (char)('a' + newPos); 
            } else {
               encrypted += " ";
            }
        }
        return encrypted;
    }
    
    private String dec(String msg, int shift)
    {
        return enc(msg, 26 - (shift % 26));
    }
    
}
