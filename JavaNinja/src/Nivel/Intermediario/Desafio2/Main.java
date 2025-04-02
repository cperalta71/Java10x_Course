package Nivel.Intermediario.Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ninja ninja = new Ninja();
        Uchiha uchiha = new Uchiha();

        //PErguntamos quantos ninjas serao caddastrados
        System.out.print("Quantidade de ninjas a cadastrar: ");
        int quantidadeNinjas = scanner.nextInt();
        scanner.nextLine(); //Limpeza de buffer

        Ninja[] infoNinjas = new Ninja[quantidadeNinjas];

        //Começamos o loop ate a quantidade de ninjas maximo
        for (int i = 0; i < quantidadeNinjas; i++) {
            System.out.println("1. Cadastrar novo ninja");
            System.out.println("2. Atualizar habilidade ninja");
            System.out.println("3. Exibir todos os ninjas");
            System.out.println("4. Sair");
            System.out.printf("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    ninja.nome = scanner.nextLine();

                    System.out.println("Idade: ");
                    ninja.idade = scanner.nextInt();
                    scanner.nextLine(); //Limpeza de buffer

                    System.out.println("Aldeia: ");
                    ninja.aldeia = scanner.nextLine();

                    System.out.println("Dificuldade da Missão: ");
                    ninja.nivelDificuldade = scanner.nextLine();

                    System.out.println("Status: ");
                    ninja.statusMissao = scanner.nextLine();

                    infoNinjas[i] = ninja;
                    break;
            }

        }

        scanner.close();
    }

}
