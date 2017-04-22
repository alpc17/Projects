/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alura;

/**
 *
 * @author ALPC
 */
class Turma {

   Aluno[] alunos;
    void imprimeNotas(){
        for (int i = 0; i < this.alunos.length; i++) {
            Aluno aluno = this.alunos[i];
            if(aluno==null)continue;
            
            System.out.println("Posição "+ i + " é o Aluno " + aluno.nome + " a nota é: " + aluno.notas);
        }
    }
}
class Aluno{
    String nome;
    int notas;
}

class TesteDaTurma {

    public static void main(String[] args) {

        Turma fj11 = new Turma();

        fj11.alunos = new Aluno[10];
        fj11.alunos[2] = new Aluno();
        fj11.alunos[3] = new Aluno();
        fj11.alunos[9] = new Aluno();
        fj11.alunos[2].notas = 33;
        fj11.alunos[2].nome = "Jaqueline";
        fj11.alunos[3].notas = 45;
        fj11.alunos[3].nome = "Francisco";
        fj11.alunos[9].notas = 48;
        fj11.alunos[9].nome = "Eduardo";


        fj11.imprimeNotas();
     
    }

}
