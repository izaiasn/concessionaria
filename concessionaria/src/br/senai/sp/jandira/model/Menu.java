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
            System.out.println("8 - Listar validar veiculo");
            System.out.println("9 - Sair do App");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/");

            System.out.print("\nESCOLHA UMA DAS OPÇÕES DO MENU: ");
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

                    System.out.print("Informe o nome do Cliente: ");
                    String nomeCliente = teclado.nextLine();
                    refelistCliente.listarCliente();


                    System.out.print("Informe o nome do Veiculo: ");
                    String nomeVeiculo = teclado.nextLine();
                    refeListVeiculo.listaVeiculo();


                    System.out.print("Informe o nome do Vendedor: ");
                    String nomeVendedor = teclado.nextLine();
                    refeListFuncionario.listarFuncionario();

                    Cliente objComprador= refelistCliente.pesquisarComprador(nomeCliente);

                    Veiculo objVeiculoVenda = refeListVeiculo.localizarVeiculoCompra(nomeVeiculo);

                    Funcionario objvebdedor = refeListFuncionario.localizaVendedor(nomeVendedor);


                    boolean venda = objVenda.realizarVenda(objComprador, objVeiculoVenda);

                    boolean formaPagamento = objVenda.validarFormaPagamento();

                    boolean vendaDireta = false;
                    boolean vendaFinanciada = false;

                    if (formaPagamento) {
                        vendaDireta = objVenda.realizarVenda(objComprador, objVeiculoVenda);
                    } else {
                        vendaFinanciada = objVenda.financiarVeiculo(objComprador, objVeiculoVenda);
                    }

                    if (vendaDireta || vendaFinanciada){
                        objComprador.dinheiroDisponivel -= objVeiculoVenda.preco;
                        System.out.println("Seu saldo é: " + objComprador.dinheiroDisponivel);

                        objvebdedor.bonusFuncionario(objVeiculoVenda);

                        System.out.println("O Funcionario recebeu: " + objvebdedor.bonus);

                    }

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
                        System.out.println("--------------------");
                        System.out.println("Veiculo Disponivel");
                        System.out.println("------------------");
                    }else {
                        System.out.println("--------------------");
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
