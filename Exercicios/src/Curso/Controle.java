/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

/**
 *
 * @author ALPC
 */
public class Controle {

    public static void main(String[] args) {
        Aluno fu = new Aluno();
        Curso a = new Curso();
        a.setNome("Analise e desenvolvimento de sistemas");
        fu.setRa(21708153);
        fu.setNome("André Luiz");
        fu.Matricula(a);

        System.out.println("Há " + a.getVaga() + " vagas no curso de " + a.getNome());

        System.out.println("O aluno " + fu.getNome() + " RA- " + fu.getRa() + " está matriculado no curo " + a.getNome());

    }
}
