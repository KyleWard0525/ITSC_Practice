/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.hard;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the palindrome problem
 * @author kward60
 */
public class PalindromeTest {
    
    public PalindromeTest() {
    }

    /**
     * Test of isPalindrome method, of class Palindrome.
     */
    @Test
    public void testIsPalindrome() {
        String[] palindromes = {"racecar", "91019", "solos", "radar", "kayak"};
        String[] notPalins = {"stone", "target", "funny", "letters", "string"};
        
        Palindrome p = new Palindrome();
        
        //Test palindromes
        for(String s : palindromes)
        {
            assertTrue(p.isPalindrome(s));
        }
        //Test non-palindromes
        for(String s : notPalins)
        {
            assertFalse(p.isPalindrome(s));
        }
    }
    
}
