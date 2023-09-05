package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Veiculo {
     String modelo;
     String cor;
     String marca;
     String placa;
     int ano;
     double preco;
     String combustivel;

     Scanner teclado = new Scanner(System.in);

     public void CadastrarVeiculo(){
         System.out.println("------------------Cadastro------------------");
         System.out.println("Digite modelo: ");
         modelo = teclado.nextLine();
         System.out.println("Digite marca: ");
         marca = teclado.nextLine();
         System.out.println("Digite a cor: ");
         cor = teclado.nextLine();
         System.out.println("Digite a Placa: ");
         placa = teclado.nextLine();
         System.out.println("Digite o combustivel: ");
         combustivel = teclado.next();
         System.out.println("Digite ano: ");
         ano = teclado.nextInt();
         System.out.println("Digite o Preço: ");
         preco = teclado.nextDouble();
         teclado.nextLine();
         System.out.println("-------------------------------------------");
         teclado.close();
     }

}





