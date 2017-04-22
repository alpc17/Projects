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
//public class Conta {
//
//    int numero;
//    Pessoa titular;
//    int agencia;
//    double saldo;
//
//    public void deposita(double valor) {
//        this.saldo += valor;
//
//    }
//
//    public void saca(double valor) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor;
//        } else {
//            System.out.println("Saldo insuficiente!");
//        }
//    }
//
//    public void transfere(double valor, Conta destino) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor;
//            destino.saldo += valor;
//            System.out.println("Transferencia efetivada");
//        }else{
//            System.out.println("Não há saldo suficiente!!");
//        }
//
//    }
//}
//
//class Pessoa {
//
//    String nome;
//    int cpf;
//
//}
//
//class Programa {
//
//    public static void main(String[] args) {
//        Conta Pedro = new Conta();
//        Conta Joao = new Conta();
//        Joao.titular = new Pessoa();
//        Pedro.titular = new Pessoa();
//
//       
//       
//        Pedro.saldo = 200.0;
//        Pedro.titular.nome = "Pedro";
//        Pedro.numero = 123;
//        
//        Joao.numero = 345;
//        Joao.saldo = 1000.0;
//        Joao.titular.nome = "Joao";
//        
//        Pedro.saca(20.0);
//        Pedro.deposita(100.0);
//        Joao.transfere(300.0, Pedro);
//        
//        System.out.println(Joao.titular.nome + " o saldo de sua conta é: "+Joao.saldo);
//        System.out.println(Pedro.titular.nome + " o saldo de sua conta é: " + Pedro.saldo);
//
//    }
//}
