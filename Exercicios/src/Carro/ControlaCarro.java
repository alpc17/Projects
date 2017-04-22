/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import javax.swing.JOptionPane;

/**
 *
 * @author ALPC
 */
public class ControlaCarro {
    public static void main(String[] args) {
        Carro ka = new Carro();
    ka.ligar();
    ka.acelera();
    ka.setMotor("1.0");
    ka.freia();
    ka.desligar();
    ka.acelera();
    ka.acelera();
    ka.ligar();
    ka.acelera();
    ka.freia();
    ka.desligar();

    
       if (ka.isLigado()==true)
           JOptionPane.showMessageDialog( null , "O carro está Ligado.");
       else
           JOptionPane.showMessageDialog( null , "O carro está desligado");
      JOptionPane.showMessageDialog( null , " A Velocidade é "  + ka.getVelocidade());
    }
}
