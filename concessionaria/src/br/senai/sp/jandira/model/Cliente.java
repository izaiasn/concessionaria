package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

     String nome;
     String email;
     String endereco;
     long telefone;
     long cpf;
     long rg;
     double money;

     Scanner teclado = new Scanner(System.in);

     public void cadastrarCliente(){

         System.out.println("----------Cadastro Cliente----------");
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
         System.out.println("Informe o valor disponivel para compra: ");
         money = teclado.nextDouble();
         System.out.println("-------------------------------------------");


    }

}
