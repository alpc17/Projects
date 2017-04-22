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
public class Soma1000 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int somaTotal = 0;
        int resultado = num1 + num2;
        do {
            System.out.println("O resultado da soma é: " + resultado);
            somaTotal += resultado;
            System.out.println("A soma total é: "+ somaTotal);
        }while(somaTotal<=1000);
 
        System.out.println("Saiu do loop, o valor da soma tota é "+ somaTotal +" !");
    
    
    }

}
