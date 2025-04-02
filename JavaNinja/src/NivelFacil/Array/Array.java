package NivelFacil.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos ao usuario a quantidade de indices para o array
        System.out.println("Ingresar cantidad de array; ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //Declaramos o array e o inicializamos com a quantidade de indices informado pelo usuario
        int[] array = new int[numero];

        //Pedimos ao usuario os numeros para os indices correspondentes
        for (int i = 0; i < numero; i++) {
            System.out.print("ingresar numero: ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("----------------------------------"); // Divisão

        // Imprimimos os numeros ingresados pelo usuario
        for (int i = 0; i < numero; i++) {
            System.out.println("Numero array: " + array[i]);
        }

        scanner.close();
    }
}