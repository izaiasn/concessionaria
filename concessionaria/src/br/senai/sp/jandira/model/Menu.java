package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("-------------------------------------");
        System.out.println("-                                   -");
        System.out.println("-                                   -");
        System.out.println("--------------Bem vindo--------------");
        System.out.println("-                                   -");
        System.out.println("-                                   -");
        System.out.println("-------------------------------------");

        Cliente newObjCliente = new Cliente();


        Veiculo newObjveiculo = new Veiculo();


        Venda newObjVenda = new Venda();

        Funcionario newObjFuncionario = new Funcionario();


        boolean continua = true;
        Scanner teclado = new Scanner(System.in);

        while (continua){
            System.out.println("-------------------------------------");
            System.out.println("-                                   -");
            System.out.println("-                                   -");
            System.out.println("- 1- Cadastro Cliente               -");
            System.out.println("- 2- Cadastro Veiculo               -");
            System.out.println("- 3- Cadastro funcionario           -");
            System.out.println("- 4- Realizar venda                 -");
            System.out.println("- 5- Sair                           -");
            System.out.println("-                                   -");
            System.out.println("-                                   -");
            System.out.println("-------------------------------------");
            int escolhaUsuario = teclado.nextInt();

            switch (escolhaUsuario){
                case 1:
                    newObjCliente.cadastrarCliente();
                    break;

                case 2:
                    newObjveiculo.cadastrarVeiculo();
                    break;

                case 3:
                    newObjFuncionario.castroFuncionario();

                    break;

                case 4:
                   boolean validaVenda = newObjVenda.realizarVenda(newObjveiculo , newObjCliente);/** Passar argumento esperados (Venda e Cliente) */
                   if (validaVenda){
                       newObjCliente.money -= newObjveiculo.preco;
                       System.out.println("O saldo do cliente: "+ newObjCliente.money);


                   }
                   newObjFuncionario.receberComissao(newObjveiculo);
                    System.out.println("Funcionario " + newObjFuncionario.nome + "Vai receber de Bonus " + newObjFuncionario.comissao);

                    break;

                case 5:
                    continua = false;
                    break;
            }if (escolhaUsuario < 1 || escolhaUsuario > 5){
                System.out.println("Escolha uma opção válida!!");
            }

        }
    }
}
