package com.dio.desafio;

import javax.swing.*;

public abstract class Conta implements IConta{
    /*declarando variáveis principais*/
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected String tipoConta;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Conta.SEQUENCIAL++;
    };


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    @Override
    public void imprimirExtrato() {
        JOptionPane.showMessageDialog(null,"\nAgencia: " + this.agencia +
                "\nConta: " + this.conta +
                "\nTipo: " + this.tipoConta +
                "\nSaldo: " + this.saldo);

    }

}
