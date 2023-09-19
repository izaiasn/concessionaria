package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    String nome;
    String email;
    String endereco;
    long telefone;
    long cpf;
    long rg;
    double  bonus;

    Scanner teclado = new Scanner(System.in);
    List<Funcionario> listaFuncionario= new ArrayList<>();

    public void cadastrarFuncionario(){

        System.out.println("-/-/-/-/-/-/-/-/-/Cadastrar-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu email: ");
        email = teclado.next();
        System.out.println("Digite seu endereco: ");
        endereco = teclado.next();
        System.out.println("Digite seu CPF: ");
        cpf = teclado.nextLong();
        System.out.println("Digite seu RG: ");
        rg = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = teclado.nextLong();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        System.out.println("Cadastro Finalizado");
    }

    public void bonusFuncionario(Veiculo objVeiculo){

        bonus = objVeiculo.preco * 0.10;
    }

    public  void adicionarFuncionario(Funcionario objFuncionario){
        listaFuncionario.add(objFuncionario);
    }

    public void listarFuncionario(){
        for (Funcionario objFuncionario: listaFuncionario){
            System.out.println("Modelo: "+ objFuncionario.nome + " Ano: "+ objFuncionario.email+" Preço: "+ objFuncionario.bonus);
        }
    }



}
