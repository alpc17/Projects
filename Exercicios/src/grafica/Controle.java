/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ALPC
 */
public class Controle {

    public static void main(String[] args) throws IOException {
        int escolha, fim = 0;
        int x;

        Livro a = new Livro();
        Livro b = new Livro();

        Scanner entrada = new Scanner(System.in);
//        for (x = 1; x < 101; x++) {
//            
//            
//
//            // Livro x = new Livro();
//            System.out.println("cod:" + x + " Digite o nome do livro:");
//            x.nome = entrada.nextLine();
//            System.out.println("cod:" + x + "Nome do livro: " + x.nome);
//            //break;
//        }

        do {

            a.nome = "The whalking dead";
            a.editora = "Futura";
            a.pagina = 311;
            a.anoPublicacao = 2016;
            a.cidade = "Além Paraíba";
            a.cep = 36660000;
            a.numero = 100;
            a.rua = "Antonio Bernado";

            b.nome = "A cabana";
            b.editora = "America";
            b.pagina = 112;
            b.anoPublicacao = 2017;
            b.cidade = "Além Paraíba";
            b.cep = 366611111;
            b.numero = 210;
            b.rua = "Antonio Galdino";

            System.out.println("1-The whalking dead\n2-A cabana");
            System.out.println("Digite o códgo do livro desejado: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nome: " + a.nome + "\nAno da publicação: " + a.anoPublicacao);
                    System.out.println("Editora: " + a.editora + "\nPáginas: " + a.pagina);
                    System.out.println("Para informações da editora digite 1\nPara Finalizar digite 2:.");
                    escolha = entrada.nextInt();
                    if (escolha == 1) {
                        System.out.println("Endereço:\n " + a.cidade + "\nCEP:\n" + a.cep + "\nNúmero\n" + a.numero);
                        System.in.read();
                    } else if (escolha == 2) {
                        fim = 2;
                    }
                    break;
                case 2:
                    System.out.println("Nome: " + b.nome + "\nAno da publicação: " + b.anoPublicacao);
                    System.out.println("Editora: " + b.editora + "\nPáginas: " + b.pagina);
                    System.out.println("Para informações da editora digite 1.\nPara Finalizar digite 2:");
                    escolha = entrada.nextInt();
                    if (escolha == 1) {
                        System.out.println("Endereço:\n " + b.cidade + "\nCEP:\n" + b.cep + "\nNúmero\n" + b.numero);
                        System.in.read();
                    } else if (escolha == 2) {
                        fim = 2;
                    }
                    break;
                default:
                    System.out.println("Tente novamente!");
            }
        } while(fim != 2);
    }

}
