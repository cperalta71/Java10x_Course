package Nivel.Intermediario.AbstractClasses.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(0, TipoConta.CORRENTE);

        ContaPoupanca poupanca = new ContaPoupanca(0, TipoConta.POUPANCA);

        Menu menu = new Menu();

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double valor;

        while (opcao != 5) {
            opcao = menu.exibirMenuPrincipal(input);
            switch (opcao) {
                case 1:
                        opcao = menu.solicitarTipoConta(input);
                        switch (opcao) { // Switch opcao 1 (Depositar valor)
                            case 1:
                                valor = menu.solicitarValor(input);
                                corrente.depositar(valor);
                                System.out.printf("\nVocê depositou R$ " + valor + "\n");
                                break;
                            case 2:
                                valor = menu.solicitarValor(input);
                                poupanca.depositar(valor);
                                double taxa = valor * 0.01;
                                System.out.printf("\nVocê depositou R$ " + valor + "\nFoi cobrada uma taxa de R$ " + taxa);
                                break;
                            default:
                                System.out.println("Opção invalida. Tente Novamente");
                                break;

                    }
                    break;
                case 2:
                    opcao = menu.solicitarTipoConta(input);
                    switch (opcao){ // Switch para a  opcao 2 (Consultar saldo)
                        case 1:
                            System.out.println("Tipo de conta: " + corrente.getTipo());
                            corrente.consultarSaldo();
                            break;
                        case 2:
                            System.out.println("Tipo de conta: " + poupanca.getTipo());
                            poupanca.consultarSaldo();
                            break;
                        default:
                            System.out.println("Opção invalida. Tente Novamente");
                            break;
                    }
                    break;
                case 3:
                    opcao = menu.solicitarTipoConta(input);
                    switch (opcao) { //Switch opcao 3 (SAcar valor)
                        case 1:
                            System.out.println("Tipo de conta: " + corrente.getTipo());
                            valor = menu.solicitarValor(input);
                            corrente.sacar(valor);
                            System.out.println("Você sacou R$ " + valor);
                            break;
                        case 2:
                            System.out.println("Tipo de conta: " + poupanca.getTipo());
                            valor = menu.solicitarValor(input);
                            poupanca.sacar(valor);
                            System.out.println("Você sacou R$ " + valor);
                            break;
                        default:
                            System.out.println("Opção invalida. Tente Novamente");
                            break;
                    }
                    break;
                case 4: // Transferir
                    opcao = menu.solicitarTipoConta(input);
                    switch (opcao){ //Swtich opcao 4 (Transferir)
                        case 1:
                            System.out.println("Tipo de conta: " + corrente.getTipo());
                            valor = menu.solicitarValor(input);
                            corrente.transferir(valor, poupanca);
                            System.out.println("Você Transferiu R$ " + valor);
                            break;
                        case 2:
                            valor = menu.solicitarValor(input);
                            poupanca.transferir(valor, corrente);
                            System.out.println("Você Transferiu R$ " + valor);
                            break;
                        case 3:
                            System.out.println("Voltando...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida. Tente Novamente");
                    break;
            }
        }

        input.close();

    }
}

//TODO: modificar as classes de contacorrente e contapoupanca e adiciconar um metodo sobrecarregado para realizar transferencias