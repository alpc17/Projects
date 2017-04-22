/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

class Pessoa {

    String nome;
    int anoNascimento;

    public int idade() {
        return 2017 - anoNascimento;
    }
}

/**
 *
 * @author ALPC
 */
public class UtilizaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        p.nome = "Antonio";
        p.anoNascimento = 1988;
        System.out.println(p.nome + " tem " + p.idade() + " anos.");
    }

}
