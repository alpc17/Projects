/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author ALPC
 */
public class Validar {

    public static void main(String[] args) {
        Calcula a = new Calcula();
        a.num1 = 10;
        a.num2 = 5;
        
        System.out.println("O primeiro número é "+ a.num1+ " e o segundo é "+ a.num2+" .");
        System.out.println("A soma é " + a.Soma());
        System.out.println("A subtração é " + a.Subtracao());
        System.out.println("A multiplicação é " + a.Mutiplicacao());
        System.out.println("A divisão é " + a.Divisao());

    }

}
