package NivelIntermediario.Desafio6;

import java.util.Scanner;

public class MenuNinja {


    public int exibirMenu(int opcao, Scanner scanner){
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("\n----------------------- CADASTRO DE NINJAS -----------------------");
            System.out.println("1. Cadastrar Ninja ao inicio da Lista.");
            System.out.println("2. Remover Ninja da Lista (Por index).");
            System.out.println("3. Buscar Ninjas (Nome, Idade, Aldeia).");
            System.out.println("4. Listar Ninjas. ");
            System.out.println("5. Ordenar Ninjas (Nome, Idade, Aldeia).");
            System.out.println("6. Sair. ");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada invalida. Tente novamente.");
                scanner.nextLine();
            }
        }
        return opcao;
    }

    public Cadastro menuAdicionarNinjas(Cadastro cadastro, Scanner scanner){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        try {
            int idade = scanner.nextInt();
            scanner.nextLine();
        System.out.print("Aldeia: ");
        String aldeia = scanner.nextLine();
        cadastro.adicionarNinjas(nome, idade, aldeia);
        } catch (Exception e) {
            System.out.println("Idade deve conter apenas numeros inteiros");
            scanner.nextLine();
        }
        return cadastro;
    }

    public Cadastro menuBuscarNinjas(Cadastro cadastro, Scanner scanner){
        int opcao = 0;
        boolean entradaValida = false;
        do {
            System.out.println("------------------------- BUSCAR NINJA -------------------------");
            System.out.println("Escolha o criterio. ");
            System.out.println("1. Nome");
            System.out.println("2. Idade");
            System.out.println("3. Aldeia");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Erro: insira apenas números inteiros para a idade.");
                scanner.nextLine();
                continue;
            }
            switch (opcao){
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    cadastro.buscarNinjaPorNome(nome);
                    break;
                case 2:
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    cadastro.buscarNinjaPorIdade(idade);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Digite Aldeia: ");
                    String aldeia = scanner.nextLine();
                    cadastro.buscarNinjaPorAldeia(aldeia);
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
                    break;
            }
        }while (!entradaValida);
        return cadastro;
    }

    public Cadastro menuOrdenarNinjas(Cadastro ordemCadastro, Scanner scanner){
        int opcao = 0;
        boolean entradaValida = false;
        do {
            System.out.println("--------------------------- ORDENAR NINJAS ---------------------------");
            System.out.println("1. Ordenar por nome (Ordem Alfabética).");
            System.out.println("2. Ordenar por idade (Ordem Crescente).");
            System.out.println("3. Ordenar por aldeia (Ordem Alfabético).");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Erro: insira apenas números inteiros para a idade.");
                scanner.nextLine();
                continue;
            }
            switch (opcao){
                case 1:
                    System.out.println("-------------------------- ORDEM POR NOME --------------------------");
                    ordemCadastro.ordenarNinjasPorNome();
                    break;
                case 2:
                    System.out.println("-------------------------- ORDEM POR IDADE --------------------------");
                    ordemCadastro.ordenarNinjasPorIdade();
                    break;
                case 3:
                    System.out.println("-------------------------- ORDEM POR ALDEIA --------------------------");
                    ordemCadastro.ordenarNinjasPorAldeia();
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }while (!entradaValida);
        return ordemCadastro;
    }


}
