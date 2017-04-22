/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cao;

/**
 *
 * @author ALPC
 */
public class Validacao {
    
    public static void main(String[] args) {
        Cachorro p = new Cachorro();
        p.nome="Thor";
        p.anoNascimento=2010;
        System.out.println("O nome cachorro é "+ p.nome + " e o ano de nascimento foi "+p.anoNascimento +" e a idade é " + p.idade()+"!!");
        System.out.println("Daqui a 10 anos ele terá "+ (p.idade()+10)); // ou p.futuro()
    }
}
