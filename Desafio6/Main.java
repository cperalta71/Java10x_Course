package NivelIntermediario.Desafio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        //Ninjas cadstrados desde um inicio
        //------------------------------------------------------
        cadastro.cadastroNinjasIniciais();
        //------------------------------------------------------

        MenuNinja menu = new MenuNinja();
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 6) {
            opcao = menu.exibirMenu(opcao, scanner);
            scanner.nextLine();
            switch (opcao){
                case 1:
                    cadastro = menu.menuAdicionarNinjas(cadastro, scanner);
                    break;
                case 2:
                    cadastro.removerNinjasPorIndice(scanner);
                    break;
                case 3:
                    cadastro = menu.menuBuscarNinjas(cadastro, scanner);
                    break;
                case 4:
                    cadastro.listarNinjas();
                    break;
                case 5:
                    cadastro = menu.menuOrdenarNinjas(cadastro, scanner);
                    cadastro.listarNinjas();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente");
                    break;
            }
        }
    }
}
