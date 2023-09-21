package br.senai.sp.jandira.model;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Veiculo {
     String modelo;
     String cor;
     String marca;
     String placa;
     int ano;
     double preco;
     String combustivel;
    List<Veiculo> listveiculos= new ArrayList<>();

     Scanner teclado = new Scanner(System.in);

     public void CadastrarVeiculo(){
         System.out.println("-/-/-/-/-/-/-/-/-/Cadastro-/-/-/-/-/-/-/-/-/");
         System.out.print("Digite modelo:  ");
         modelo = teclado.nextLine();
         System.out.print("Digite marca: ");
         marca = teclado.nextLine();
         System.out.print("Digite a cor: ");
         cor = teclado.nextLine();
         System.out.print("Digite a Placa:  ");
         placa = teclado.nextLine();
         System.out.print("Digite o combustivel: ");
         combustivel = teclado.next();
         System.out.print("Digite ano: ");
         ano = teclado.nextInt();
         System.out.print("Digite o Preço:  ");
         preco = teclado.nextDouble();
         teclado.nextLine();
         System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
     }
     public  void adicionarVeiculo(Veiculo objVeiculo){
         listveiculos.add(objVeiculo);
     }

     public void  listaVeiculo(){
         for (Veiculo objVeiculo: listveiculos){
             System.out.println("Modelo: "+ objVeiculo.modelo + " Ano: "+ objVeiculo.ano+" Preço: "+objVeiculo.preco);
         }
     }

     public boolean pesquisarVeiculo(String veiculoPesquisado){

         for (Veiculo ObjVeiculo: listveiculos){
             if(ObjVeiculo.modelo.equalsIgnoreCase(veiculoPesquisado)){
                 return true;
             }
         }return false;
     }

     public Veiculo localizarVeiculoCompra(String modeloVeiculo){

         for(Veiculo veiculo: listveiculos){
             if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)){
                 return veiculo;
             }
         }return null;
     }
}





