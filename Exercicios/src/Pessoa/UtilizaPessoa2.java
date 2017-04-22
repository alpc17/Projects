/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;
class Pessoa2{
    String nome;
    int anoNascimento;
    boolean jovem;
    public int idade(){
        return 2017 - anoNascimento;
    }
    public boolean isJovem(){
        jovem = idade() < 30;
        return jovem;
    }
}
/**
 *
 * @author ALPC
 */
public class UtilizaPessoa2 {
    public static void main(String[] args) {
        Pessoa2 p =  new Pessoa2();
        
        p.nome = "Fulano";
        p.anoNascimento = 1990;
        
        System.out.println(p.nome +" tem " + p.idade() + "e ele é " + p.isJovem());
        
    }
    
}
