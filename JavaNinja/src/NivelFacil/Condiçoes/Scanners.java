package NivelFacil.Condiçoes;

import java.util.Scanner;

public class Scanners {
    /*
    * Scanner = Tem como objetivo que o usuario faça o input e o programador trabalhe com isso
    * Objetivo = O usuario criar um ninja e validar esses dados
    *
    * quando colocamos um String entre "\\s*", esse trecho é retirado do println
    * */
    public static void main(String[] args) {


        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva o nome do ninja");
        String nomedoNinja = caixaDeTexto.nextLine();

        System.out.println("O nome do ninja é: " + nomedoNinja);

        System.out.println("Idade: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do ninja: " + idadeNinja);

        if(idadeNinja >= 18){
            System.out.println("Esse ninja ja é maior de idade.");
        } else {
            System.out.println("Esse ninja é novo pacas kkkkkkkk");


            }



        caixaDeTexto.close();
    }
}
