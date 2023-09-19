package br.senai.sp.jandira.model;

public class Venda {

    public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo){


        System.out.println("------ Validando Venda -------");


        for (Cliente refeObjCliente: objCliente.listCliente){
            System.out.println("re: " + refeObjCliente.nome);

        for (Veiculo refeObjVeiculo: objVeiculo.listveiculos){
            System.out.println(refeObjVeiculo.modelo);
            if (refeObjCliente.dinheiroDisponivel >= refeObjVeiculo.preco){
                System.out.println("------------------- Parabéns  --------------------");
                System.out.println("Olá " + refeObjCliente.nome);
                System.out.println("Você acaba de adquirir um " + refeObjVeiculo.modelo);
                System.out.println("No precinho de " + refeObjVeiculo.preco);
                System.out.println("--------------------------------------------------");

            }
        }
        }
        if (objCliente.dinheiroDisponivel >= objVeiculo.preco){

            System.out.println("------------------- Parabéns  --------------------");




            return true;

        } else {
            System.out.println("Escolha um carro mais acessivel");
            return false;
        }


    }


}