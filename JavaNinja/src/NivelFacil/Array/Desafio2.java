package NivelFacil.Array;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        //Declaração do scanner
        Scanner scanner = new Scanner(System.in);
        //Opção sair iniciará em falso para o loop while continue registrando dados
        boolean sair = false;

        //Declaramos variavel i para contar somente os nomes cadastrados e nenhum "null"
        int i = 0;

        //Pedir Quantidade de alunos
        System.out.print("Quantidade de ninjas a cadastrar: ");
        int quantidadeNinjas = scanner.nextInt();
        scanner.nextLine(); //Quebra de linha
        String[] Ninjas = new String[quantidadeNinjas]; // Declaramos e inicializamos o NivelFacil.TiposDeDados.Array

        //iniciamos loop com a opção sair em falso
        while (sair == false){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); //Elimina a Quebra de linha do buffer

            //Iniciamos o switchCases
            switch (opcao){
                    case 1:
                        //Pedimos o nome do ninja a cadastrar
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        Ninjas[i] = nome;
                        i++; //contamos somente os ninjas cadastrados
                        break;
                    case 2:
                        if (i == 0){
                            System.out.println("Nenhum ninja cadastrado.");
                        } else {
                            for (int j = 0; j < i; j++) {
                                System.out.println(Ninjas[j]); //Listamos os ninjas cadastrados
                            }
                        }
                        break;
                    case 3:
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção invalida! Tente novamente."); //Mensagem de opção invalida
                }
        }
        scanner.close(); //Fechamos o scanner
    }
}
