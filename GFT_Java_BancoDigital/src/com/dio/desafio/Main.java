package com.dio.desafio;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int confirm;
        String tipo;
        Conta c1 = new ContaCorrente();
        c1.depositar(150);
        Conta c2;

        JOptionPane.showMessageDialog(null,"Desafio Banco Digital - DIO / GFT_JAVA\n\n" +
                "No decorrer do programa teremos duas contas, a padrão é uma corrente com saldo de R$ 150\n" +
                "A segunda conta que será criada a partir daqui poderá ser corrente ou poupança");
        do {
            tipo = JOptionPane.showInputDialog("Escolha entre Corrente ou Poupança:");
            confirm = JOptionPane.showConfirmDialog(null, "Você escolheu: " + tipo);

            if(tipo.toLowerCase().equals("corrente")){
                c2 = new ContaCorrente();
            }
            else{
                c2 = new ContaPoupanca();
            }
        }
        while(confirm!=0 && confirm!=2);

            if(confirm == 0){
                String[] op = {"Sacar", "Depositar", "Transferir"};
                Object escolhaOperacao = JOptionPane.showInputDialog(null, "Escolha um item" , "Selecao de itens" ,
                        JOptionPane.PLAIN_MESSAGE , null ,op,"Sacar");

                String valorOperacao = JOptionPane.showInputDialog("Coloque o valor destinado a sua operação:");
                if(escolhaOperacao.toString().equals("Sacar")){
                    c2.sacar(Double.parseDouble(valorOperacao));
                }else if(escolhaOperacao.toString().equals("Depositar")){
                    c2.depositar(Double.parseDouble(valorOperacao));
                }
                else{
                    c2.transferir(Double.parseDouble(valorOperacao), c1);

                }
                c1.imprimirExtrato();
                c2.imprimirExtrato();
            }
        }
}

