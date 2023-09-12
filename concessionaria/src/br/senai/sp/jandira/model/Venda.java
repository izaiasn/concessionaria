package br.senai.sp.jandira.model;

public class Venda {
    boolean venda = true;

    public boolean realizarVenda(Veiculo objetoVeiculo, Cliente objetoCliente){

        if (objetoCliente.money >= objetoVeiculo.preco){

            System.out.println("Parabens! ");
            System.out.println( objetoCliente.nome + "Compra realizada ! ");
            System.out.println("No preço de " + objetoVeiculo.preco);
            return true;

        }else {
            System.out.println("Escolha um veiculo mais em conta! ");
            System.out.println("Saldo: "+ objetoCliente.money);
            return false;
        }



    }
}
