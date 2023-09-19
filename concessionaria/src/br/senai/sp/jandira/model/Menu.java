package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void menu(){



        Cliente refelistCliente = new Cliente();

        Veiculo refeListVeiculo = new Veiculo();
        Funcionario refeListFuncionario = new Funcionario();
        Funcionario objFuncionario = new Funcionario();
        Venda objVenda = new Venda();

        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;


        while (continuar){

            System.out.println("\n-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veiculo");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Listar Veiculos");
            System.out.println("6 - Listar Cliente");
            System.out.println("7 - Listar Funcionario");
            System.out.println("9 - Sair do App");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/");

            int decisao = teclado.nextInt();
            teclado.nextLine();

            switch (decisao){

                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente();
                    refelistCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.CadastrarVeiculo();
                    refeListVeiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:

                    objFuncionario.cadastrarFuncionario();
                    refeListFuncionario.adicionarFuncionario(objFuncionario);
                    break;

                case 4:
                    boolean venda = objVenda.realizarVenda(refelistCliente, refeListVeiculo);

                    if (venda){
                        refelistCliente.dinheiroDisponivel -= refeListVeiculo.preco;
                    }
                    objFuncionario.bonusFuncionario(refeListVeiculo);
                    System.out.println("O funcionario Recebeu: " +objFuncionario.bonus);
                    break;

                case 5:

                    refeListVeiculo.listaVeiculo();
                    break;

                case 6:
                    refelistCliente.listarCliente();
                    break;

                case 7:
                    refeListFuncionario.listarFuncionario();
                    break;

                case 8:
                    System.out.println("\nInforme o nome do veiculo: ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;

                    if (veiculoPesquisado != null && veiculoPesquisado != "" ){
                        validaVeiculo = refeListVeiculo.pesquisarVeiculo(veiculoPesquisado);}

                    if (validaVeiculo){
                        System.out.println("\n------------------");
                        System.out.println("Veiculo Disponivel");
                        System.out.println("------------------");
                    }else {
                        System.out.println("\n------------------");
                        System.out.println("Veiculo indisponivel");
                        System.out.println("------------------");
                    }
                    break;

                case 9:
                    continuar = false;
                    break;
            }

            if (decisao < 0 || decisao > 9 ){
                System.out.println("\nDigite uma opção válida");
            }
        }

    }
}
