/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculdade;

/**
 *
 * @author ALPC
 */
public class Controle {
    public static void main(String[] args) {
        Professor p = new Professor();
        Professor x = new Professor();
        Materia m = new Materia();
        
       
      
        if(p.atribui(m)){
            System.out.println("Professor atribuido");
        }else{
            System.out.println("Não atribuido!");
        }
            
    }
}
