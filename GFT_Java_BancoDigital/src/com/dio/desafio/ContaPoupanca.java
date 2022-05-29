package com.dio.desafio;

public class ContaPoupanca extends Conta{


    public void imprimirExtrato(){
        super.tipoConta = "Poupança";
        super.imprimirExtrato();
    }
}
