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
public class Curso {

    private String nome;
    private int vaga = 10;

    public boolean Matricula() {
        if (getVaga() > 0) {
            vaga--;
        }
        return true;
    }

    /**
     * @return the vaga
     */
    public int getVaga() {
        return vaga;
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

}
