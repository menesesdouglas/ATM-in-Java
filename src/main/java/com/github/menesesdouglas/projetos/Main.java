package com.github.menesesdouglas.projetos;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Banco CN - Coreia do Norte ---");
        System.out.println("Informe o número da conta: ");
        String conta_num = input.nextLine();

        ContaBancaria conta = new ContaBancaria(conta_num);

        while (true){
            System.out.println("--- Banco CN - Coreia do Norte ---");
            System.out.println("Bem vindo!\n1. Saldo\n2. Depositar\n3. Sacar\n0. Sair");

            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Saldo da conta: R$ " + conta.verSaldo());
                    Thread.sleep(3000);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito:");
                    System.out.print("R$ ");
                    double valor_deposito = input.nextDouble();
                    try {
                        conta.depositoValor(valor_deposito);
                        System.out.println("Processando...");
                        Thread.sleep(1500);
                        System.out.println("Operação concluída.");
                        Thread.sleep(3000);
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERRO: " + e.getMessage());
                        Thread.sleep(3000);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor do saque:");
                    System.out.print("R$ ");
                    double valor_saque = input.nextDouble();
                    try {
                        conta.sacarValor(valor_saque);
                        System.out.println("Processando...");
                        Thread.sleep(1500);
                        System.out.println("Operação concluída.");
                        Thread.sleep(3000);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println("ERRO: " + e.getMessage());
                        Thread.sleep(3000);
                    } catch (IllegalArgumentException e) {
                        System.out.println("ERRO: " + e.getMessage());
                        Thread.sleep(3000);
                    }
                    break;
                case 0:
                    System.out.println("Obrigado!\nBanco CN - Coreia do Norte");
                    Thread.sleep(3000);
                    input.close();
                    break;
            }
        }
    }
}
