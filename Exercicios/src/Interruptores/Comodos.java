/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interruptores;

import java.util.ArrayList;

/**
 *
 * @author ALPC
 */
public class Comodos {
private String nome;
private ArrayList<Interruptor> interruptores;
public Comodos(){
    interruptores = new ArrayList<>();
}
public void conecta(Interruptor interruptor){
  interruptores.add(interruptor);
   
}
public void apagaTodos(){
    for(Interruptor i: interruptores){
        if(i.getLampada().isAceso()){
            i.aciona();
        }
    }
}
public void acendeTodos(){
    for(Interruptor i: interruptores){
        if(!i.getLampada().isAceso()){
            i.aciona();
        }
    }
}
public int obtemIluminacao(){
    double acesos = 0;
    double total= interruptores.size();
    for(Interruptor i: interruptores){
        if(i.getLampada().isAceso()){
            acesos++;
        }
    }
    int valorFinal =(int)acesos / (int)total * 100;
    return valorFinal;
}
public void acesas(){
     for(Interruptor i: interruptores){
         System.out.println(i.getLampada().isAceso());
     }
 }
}




