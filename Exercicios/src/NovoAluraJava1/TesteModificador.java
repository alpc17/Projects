/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NovoAluraJava1;

/**
 *
 * @author ALPC
 */
public class TesteModificador {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setRg(23456);
        f1.setNome("André");
        Funcionario f2 =new Funcionario("LUIZ",12345);
        
        System.out.println(f1.getNome() + " " + f1.getRg());
        System.out.println(f2.getNome()+ " " + f2.getRg());
    }
}
