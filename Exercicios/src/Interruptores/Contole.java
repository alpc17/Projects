/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interruptores;

import javax.swing.JOptionPane;

/**
 *
 * @author ALPC
 */
public class Contole {
    public static void main(String[] args) {
        
        // Cria o comodo
        Comodos sala = new Comodos();
        Comodos quarto = new Comodos();
        
        // Cria os interruptores
        Interruptor i1 = new Interruptor();
        Interruptor i2 = new Interruptor();
        Interruptor i3 = new Interruptor();
        Interruptor i4 = new Interruptor();
        Interruptor i5 = new Interruptor();
        Interruptor i6 = new Interruptor();
        
        // Cria as lampadas, conectando nos interruptores
        i1.conecta(new Lampada());
        i2.conecta(new Lampada());
        i3.conecta(new Lampada());
        i4.conecta(new Lampada());
        i5.conecta(new Lampada());
        i6.conecta(new Lampada());
        // Conecta os interruptores na sala
        sala.conecta(i1);
        sala.conecta(i2);
        sala.conecta(i3);
        sala.conecta(i4);
        sala.conecta(i5);
        quarto.conecta(i6);
        
        
//        // Acende todos
//        sala.acendeTodos();
//        // Deve estar em 100%
//        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");
//        
//        // Apaga dois interruptores
////        i1.aciona();
//        i2.aciona();
//        // Deve estar em 60%
//        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");
//
//        // Apaga todos
//        sala.apagaTodos();
//        // Deve estar em 0%
//        JOptionPane.showMessageDialog(null, "A iluminação da sala está em "+ sala.obtemIluminacao() + "%");
//        sala.acendeTodos();
       
    }
}
