package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Venda {

    Scanner teclado = new Scanner(System.in);

    public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo){

        System.out.println("------ Validando Venda -------");

        if (objCliente.dinheiroDisponivel >= objVeiculo.preco){

            System.out.println("------------------- Parabéns  --------------------");
            System.out.println("Olá " + objCliente.nome);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.preco);
            System.out.println("--------------------------------------------------");

            return true;

        } else {
            System.out.println("Escolha um carro mais acessivel");
            return false;
        }
    }


    public boolean validarFormaPagamento(){
        System.out.println("// ----   Forma de Pagamento  ---- //");
        System.out.println("// ---- 1 - À vista           ---- //");
        System.out.println("// ---- 2 - Financiado        ---- //");
        System.out.println("// ------------------------------- //");

        int option = teclado.nextInt();
        teclado.nextLine();

        if (option == 1){
            return true;
        }

        return false;
    }

    public boolean financiarVeiculo(Cliente objCliente, Veiculo objVeiculo){

        System.out.println("/// ---- Financiamento ---- ///");
        System.out.println("Informe o valor de entrada: ");
        double valorEntrada = teclado.nextDouble();
        teclado.nextLine();

        if (valorEntrada <= objCliente.dinheiroDisponivel && valorEntrada > 0){

            double valorFinanciado = objVeiculo.preco - valorEntrada;

            System.out.println("O financiamento ficou em " + valorFinanciado );
            System.out.println("Informe em quantas vezes deseja parcelar: ");
            int parcelas = teclado.nextInt();
            teclado.nextLine();

            double valorParcela = valorFinanciado/parcelas;

            System.out.println("O Valor da Parcela " + valorParcela );

            return true;

        }

        return false;
    }

}