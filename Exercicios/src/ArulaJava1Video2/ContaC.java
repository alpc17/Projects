///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ArulaJava1Video2;
//
///**
// *
// * @author ALPC
// */
//public class ContaC {
//
//    Pessoa titular;
//    int numcc;
//    double saldo;
//    int agencia;
//
//    void deposita(double valorASerDepositado) {
//        this.saldo += valorASerDepositado;
//    }
//
//    void saca(double valorASerSacado) {
//        if (this.saldo >= valorASerSacado) {
//            this.saldo -= valorASerSacado;
//        }else{
//            System.out.println("Não há saldo suficiente! \n Seu saldo é: "+ this.saldo);
//        }
//
//    }
//
//    void trasfere(double valor, ContaC destino) {
//        if(this.saldo >= valor){
//        destino.saldo += valor;
//        this.saldo -= valor;
//        }else{
//            System.out.println("Não há saldo suficiente! \n Seu saldo é: "+ this.saldo);
//        }
//    }
//
//}
//
//class Pessoa {
//
//    String nome;
//    int cpf;
//}
//
//class Progrma {
//
//    public static void main(String[] args) {
//        ContaC Pedro = new ContaC();
//        ContaC Andre = new ContaC();
//
//        Pedro.numcc = 233432;
//        Pedro.saldo = 800.0;
//        Pedro.titular = new Pessoa();
//        Pedro.titular.cpf = 01202020;
//        Pedro.titular.nome = "Pedro";
//        Pedro.agencia = 898;
//
//        Andre.numcc = 12345;
//        Andre.saldo = 100.0;
//        Andre.titular = new Pessoa();
//        Andre.titular.nome = "André";
//        Andre.titular.cpf = 02303401;
//        Andre.agencia = 898;
//        //
//        Pedro.trasfere(10.0, Andre);
//        Andre.deposita(50.0);
//        Andre.trasfere(20, Pedro);
//        Andre.trasfere(100.0, Pedro);
//        Andre.trasfere(10.0, Pedro);
//        //
//        System.out.println("O saldo do " + Pedro.titular.nome + " é " + Pedro.saldo + " .");
//        System.out.println("O saldo do " + Andre.titular.nome + " é " + Andre.saldo + " .");
//    }
//}
