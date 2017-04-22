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
public class BalançoTrimestral {

    public static void main(String[] args) {
        int gastosJaneiro = 1500;
        int gastosFevereiro = 2300;
        int gastosMarco = 1700;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre / 3;

        System.out.println("O gasto trimestral é: " + gastosTrimestre);
        System.out.println("A media mensal é: " + mediaMensal);
    }

}
