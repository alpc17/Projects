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
public class ContaBB {

    private int numero;
    Cliente titular;
    private double saldo;
    private int ag;
    private static int numeroConta = 1000;

    public ContaBB() {
        this.numero = numeroConta;
        numeroConta++;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the titular
     */
    public Cliente getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the ag
     */
    public int getAg() {
        return ag;
    }

    /**
     * @param ag the ag to set
     */
    public void setAg(int ag) {
        this.ag = ag;
    }

    /**
     * @return the numeroConta
     */
    public static int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param aNumeroConta the numeroConta to set
     */
    public static void setNumeroConta(int aNumeroConta) {
        numeroConta = aNumeroConta;
    }
}

class Cliente {

    private String nome;
    private int cpf;

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
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

class Controle {

    public static void main(String[] args) {
        ContaBB Pedro = new ContaBB();
        Pedro.setTitular(new Cliente());
        
        ContaBB Edu = new ContaBB();
        Edu.setTitular(new Cliente());
               
        Pedro.setSaldo(1000.0);
        Pedro.titular.setNome("Andre");
        
        Edu.setSaldo(200.0);
        Edu.titular.setNome("Eduardo");

        System.out.println(Pedro.getTitular().getNome() + " o valor de seu saldo é " + Pedro.getSaldo() + "conta Numero: " + Pedro.getNumero());
        System.out.println(Edu.getTitular().getNome() + " o valor de seu saldo é " + Edu.getSaldo() + "conta Numero: " + Edu.getNumero());
    }
}
