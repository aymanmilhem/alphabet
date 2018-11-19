/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;

import java.util.Arrays;

/**
 *
 * @author omega
 */
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++)
        {
            alpha[i] = (char) (97 + i);
        }
        System.out.println(Arrays.toString(alpha));
    }
    
}
