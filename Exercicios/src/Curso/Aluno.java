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
public class Aluno {

    private String nome;
    private int ra;
    private Curso curso;

    public boolean Matricula(Curso c) {
        if(c.Matricula()){
        curso = c;
        return true;
        }
        return false;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

}
