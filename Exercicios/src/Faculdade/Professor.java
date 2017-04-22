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
public class Professor {

    private String nome;
    private int matricula;
    private Materia materia;

    public boolean atribui(Materia m) {
        if (m.atribuiProfessor()) {
         materia = m;
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
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return this.materia;
    }
}
