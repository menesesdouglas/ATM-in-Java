package com.github.menesesdouglas.projetos;

public class ContaBancaria {
    private final String numcont;
    private double saldo;

    public ContaBancaria(String numcont){
        this.numcont = numcont;
        this.saldo = 0.0;
    }

    public String getNumero(){
        return this.numcont;
    }

    public double verSaldo(){
        return this.saldo;
    }

    public void sacarValor(double valor){
        if (valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente para essa operação.");
        } else if (valor <= 0){
            throw new IllegalArgumentException("Valor de saque inválido.");
        } else {
            this.saldo -= valor;
        }

    }

    public void depositoValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido");
        } else {
            this.saldo += valor;
        }
    }
}
