package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {
    String nome;
    String email;
    String endereco;
    long telefone;
    long cpf;
    long rg;
    double comissao;

    Scanner teclado = new Scanner(System.in);

    public void castroFuncionario(){
        System.out.println("------------------Cadastro Funcionario------------------");
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu email: ");
        email = teclado.next();
        System.out.print("Digite seu endereco: ");
        endereco = teclado.next();
        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLong();
        System.out.print("Digite seu RG: ");
        rg = teclado.nextLong();
        teclado.nextLine();
        System.out.print("Digite seu telefone: ");
        telefone = teclado.nextLong();
        System.out.println("Informe o valor da comissão: ");
        comissao = teclado.nextDouble();
        System.out.println("-------------------------------------------");
    }

    public void receberComissao(Veiculo objVeiculo){

        comissao = objVeiculo.preco*0.10;
        System.out.println(comissao);



    }

}
