/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArulaJava1Video1;

/**
 *
 * @author ALPC
 */
public class Fatorais {
    public static void main(String[] args) {
        long fatorial = 1;
        for (long i = 1; i < 30; i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial);
        }
    }
            
        
}
