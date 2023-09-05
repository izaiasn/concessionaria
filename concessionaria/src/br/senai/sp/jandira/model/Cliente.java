package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

     String nome;
     String email;
     String endereco;
     long telefone;
     long cpf;
     long rg;

     Scanner teclado = new Scanner(System.in);

     public void CadastrarCliente(){

         System.out.println("------------------Cadastro------------------");
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
         System.out.println("-------------------------------------------");
         teclado.close();

    }

}
