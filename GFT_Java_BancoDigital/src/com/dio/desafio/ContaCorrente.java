package com.dio.desafio;

public class ContaCorrente extends Conta{

    public void imprimirExtrato(){
        super.tipoConta = "Corrente";
        super.imprimirExtrato();
    }


}
