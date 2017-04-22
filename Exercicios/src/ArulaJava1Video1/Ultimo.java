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
public class Ultimo {

    public static void main(String[] args) {
        int x = 13;
        do {
            if (x % 2 == 0) {
                x = x / 2;
                System.out.print(x + " ");
            } else {
                x = 3 * x + 1;
                System.out.print(x + " ");
            }
        }while(x!=1);
    
    }
}
