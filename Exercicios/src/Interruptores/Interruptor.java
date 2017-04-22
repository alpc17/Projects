/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interruptores;

/**
 *
 * @author ALPC
 */
class Interruptor {
   private Lampada lampada;
   
    public Lampada getLampada() {
        return lampada;
    }
       public void conecta(Lampada lampada){
      this.lampada = lampada;
   }
   public boolean aciona(){
       if(lampada==null){
           return false;
       }
       if(lampada.isAceso()){
           lampada.apaga();
       }else{
            lampada.acende();
       }
       return true;
   }

    /**
     * @return the lampada
     */
   
      
}
