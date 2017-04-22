/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArulaJava1Video2;

/**
 *
 * @author ALPC
 */
class Turma {
   Aluno[] alunos;
    
    void imprimeNotas(){
          for(int i=0; i < this.alunos.length;i++){
              Aluno aluno = this.alunos[i];
              if(aluno==null) continue;
              System.out.print(this.alunos[i].nome + " ");
           System.out.println(aluno.nota);
       }
    }
   }
 class Aluno{
     String nome;
     int nota;
 }   
    

class testeTurma{
    public static void main(String[] args) {
       Turma f1 = new Turma();
       
       f1.alunos= new Aluno[10];
       f1.alunos[1] = new Aluno();
       
       f1.alunos[1].nome = "Pedro";
       f1.alunos[1].nota = 2;
       
       f1.alunos[2] = new Aluno();
       f1.alunos[2].nome = "André";
       f1.alunos[2].nota = 10;
       
       f1.imprimeNotas();
     
    }
}