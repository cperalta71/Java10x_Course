package NivelFacil.Condiçoes;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner nomeNinja = new Scanner(System.in);
        Scanner Missao = new Scanner(System.in);
        Scanner dificuldade = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        String ninja;
        String nomeMissao;
        String dif;
        String statusMissao;
        int idadeNinja;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do ninja: ");
            ninja = nomeNinja.next();
            System.out.println("Idade do ninja '" + ninja + "': ");
            idadeNinja = idade.nextInt();
            System.out.println("Nome da Missao: ");
            nomeMissao = Missao.next();
            System.out.println("Dificuldade da missão '" + nomeMissao + "': ");
            dif = dificuldade.next();

            if (idadeNinja < 15) {
                if (dif == "C" || dif == "D") {
                    statusMissao = "Concluida";
                } else {
                    statusMissao = "Não concluida, o ninja não tem a idade suficiente";
                }
            } else {
                statusMissao = "Concluida";
            }

            System.out.println("------------------------------------------------");

            System.out.println("Ninja: " + ninja);
            System.out.println("Idade: " + idadeNinja);
            System.out.println("Nome da Missão: " + nomeMissao);
            System.out.println("Dificuldade: " + dif);
            System.out.println("Status da Missão: " + statusMissao);

            System.out.println("------------------------------------------------");


        }
        nomeNinja.close();
        Missao.close();
        dificuldade.close();
        idade.close();

    }
}
