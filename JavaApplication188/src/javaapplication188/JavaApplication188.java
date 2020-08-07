/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication188;

import java.util.Random;

/**
 *
 * @author Onasis Reyes
 */
public class JavaApplication188 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola");
        }
        
        String hola = "aght";
        
        String temp = "";
        
        int fact = 1;
        for (int i = 1; i <= hola.length(); i++) {
            fact *= i;
        }
        
        for (int i = 0; i < fact ;i++) {
            if (!temp.contains(hola.charAt(0 + ran.nextInt(hola.length()-1)) + "")) {
                
            }
        }
        
        
        
        
        
        System.out.println("Ojala no tienes codigo escrito en esta linea chavalo");
        
        
        
        
        
        
        System.out.println("Algo linea 52");
        
    }
    
}
