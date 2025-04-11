package Nivel.Intermediario.AbstractClasses.Desafio5;

import java.util.Scanner;

public class Menu {
    public int exibirMenuPrincipal(Scanner input){
        System.out.println("\n************************* Banco de Konoha *************************");
        System.out.println("1. Depositar valor ");
        System.out.println("2. Consultar Saldo ");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }


    public int solicitarTipoConta(Scanner input){
        System.out.println("---------------------------------------------");
        System.out.println("Qual seu tipo de conta?");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }

    public double solicitarValor(Scanner input){
        System.out.print("Valor.\n");
        System.out.print("R$ ");
        double valor = input.nextDouble();
        return valor;
    }
}
