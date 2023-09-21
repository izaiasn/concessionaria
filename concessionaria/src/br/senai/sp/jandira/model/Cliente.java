package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

     String nome;
     String email;
     String endereco;
     double dinheiroDisponivel;
     long telefone;
     long cpf;
     long rg;

     Scanner teclado = new Scanner(System.in);
    List<Cliente> listCliente= new ArrayList<>();


     public void cadastrarCliente(){

         System.out.println("-/-/-/-/-/-/-/-/-/Cadastro-/-/-/-/-/-/-/-/-/");
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
         System.out.println("Quanto tu tem para gastar");
         dinheiroDisponivel = teclado.nextDouble();
         teclado.nextLine();
         System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }
    public  void adicionarCliente(Cliente objCliente){
        listCliente.add(objCliente);
    }

    public void listarCliente(){
        for (Cliente objCliente: listCliente){
            System.out.println("Nome "+ objCliente.nome + " Email: "+ objCliente.email+" Valor em caixa: "+objCliente.dinheiroDisponivel);
        }
    }

    public Cliente pesquisarComprador(String nome){
         for (Cliente cliente: listCliente){
             if (cliente.nome.equalsIgnoreCase(nome)){
                 return cliente;
             }
         }return null;
    }

}
