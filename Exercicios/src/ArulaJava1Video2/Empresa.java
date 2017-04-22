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
class Empresa {

    int cnpj;
    int livre = 0;
    Funcionarios[] empregados;

    void verFuncionarios() {
//        for (int i = 0; i < this.empregados.length; i++) {
//            Funcionarios funcionarios = this.empregados[i];
//            if (funcionarios == null) {
//                continue;
//            }
//            System.out.println("Nome: " + this.empregados[i].nome);
//            System.out.println("Salario: " + this.empregados[i].salario);
//            System.out.println("RG: " + this.empregados[i].rg + "\n");
//        }
    }

    void adiciona(Funcionarios f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }

    void mostraEmpregado() {
        for (int i = 0; i < this.empregados.length; i++) {
            Funcionarios funcionarios = this.empregados[i];
            if (funcionarios == null) {
                continue;
            }
            System.out.println("Funcionario na posição: " + i);
            System.out.println("Nome: " + this.empregados[i].nome);
        }
    }

    void mostraTodasInformaçoes() {
        for (int i = 0; i < this.empregados.length; i++) {
            Funcionarios funcionarios = this.empregados[i];
            if (funcionarios == null) {
                continue;
            }
            System.out.println("Funcionario na posição: " + i);
            System.out.println("Nome: " + this.empregados[i].nome);
            System.out.println("Salario: " + this.empregados[i].salario);
            System.out.println("RG: " + this.empregados[i].rg + "\n");
            System.out.println("É empregado? " + this.contem(this.empregados[i]));
            System.out.println("Identificador "+this.empregados[i].identificador+ ".");
        }
    }

    boolean contem(Funcionarios f) {

        for (int i = 0; i < this.empregados.length; i++) {
            Funcionarios funcionarios = this.empregados[i];
            if (funcionarios == null) {
                continue;
            }
            if (f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }

}

class Funcionarios {

    int identificador;
    static int numero = 1;
    String nome;
    double salario;
    String rg;

    public Funcionarios() {
        identificador = numero;
        numero++;
    }

}

class TestaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionarios[10];

        Funcionarios f1 = new Funcionarios();
        f1.salario = 100;
        f1.nome = "André";
        f1.rg = "987654";
        
        empresa.adiciona(f1);

        Funcionarios f2 = new Funcionarios();
        f2.nome = "Milena";
        f2.salario = 100;
        f2.rg = "34567890";
        empresa.adiciona(f2);

        Funcionarios f3 = new Funcionarios();
        f3.nome = "Pedro";
        f3.salario = 1000;
        f3.rg = "3456789";
        empresa.adiciona(f3);

//        for(int i = 0; i < 5 ; i++){
//              Funcionarios f = new Funcionarios();
//        f.salario = 1000 + i * 100;
//        empresa.adiciona(f);
//        }
        empresa.mostraTodasInformaçoes();

    }

}
//class controla {
//
//    public static void main(String[] args) {
//        Empresa f1 = new Empresa();
//        f1.funcionarios = new Funcionarios[10];
//
//        f1.funcionarios[2] = new Funcionarios();
//        f1.funcionarios[2].nome = "Pedro";
//        f1.funcionarios[2].salario = 10;
//        f1.funcionarios[2].rg = "361267";
//
//        f1.funcionarios[3] = new Funcionarios();
//        f1.funcionarios[3].nome = "Milena";
//        f1.funcionarios[3].salario = 1000;
//        f1.funcionarios[3].rg = "9876543";
//
//        f1.verFuncionarios();
//    }
//}
