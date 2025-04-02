package NivelFacil.Condiçoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Escolha um ninja: ");
        System.out.println("1- Naruto Uzumaki ");
        System.out.println("2- Sasuke Uchiha ");
        System.out.println("3- Sakura Haruno ");

        int opcaoUsuario = s.nextInt();


        switch (opcaoUsuario){
            case 1:
                System.out.println("Voce escolheu Naruto Uzumaki, o proximo hokage");
                break;
            case 2:
                System.out.println("Voce escolheu Sasuke Uchiha, o ultimo Uchiha");
                break;
            case 3:
                System.out.println("Voce escolheu Sakura Haruno, a melhor curandeira da Aldeia da Folha");
                break;
            default:
                System.out.println("Opcão inválida. Tente novamente");
                break;
        }
        s.close();
    }
}
