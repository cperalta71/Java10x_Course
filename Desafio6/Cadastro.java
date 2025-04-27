package NivelIntermediario.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Cadastro {
    private LinkedList<Ninja> cadastroNinjas = new LinkedList<>();



    public Cadastro() {
    }

    public Cadastro(LinkedList<Ninja> cadastroNinjas) {
        this.cadastroNinjas = cadastroNinjas;
    }

    public LinkedList<Ninja> getCadastroNinjas() {
        return cadastroNinjas;
    }

    public void setCadastroNinjas(LinkedList<Ninja> cadastroNinjas) {
        this.cadastroNinjas = cadastroNinjas;
    }

    public void adicionarNinjas(String nome, int idade, String aldeia){
        cadastroNinjas.addFirst(new Ninja(nome, idade, aldeia));
    }

    public void removerNinjasPorIndice(Scanner scanner){
        int index = 0;
        int i = 0;
        for (Ninja n : cadastroNinjas){
            System.out.println(i + ". " + n.toString());
            System.out.println("-------------------------");
            i++;
        }
        System.out.print("Escolha o ninja para remover: ");
        index = scanner.nextInt();
        cadastroNinjas.remove(index);
        System.out.println("Ninja Nº " + index + " removido com sucesso.");
        scanner.nextLine();
    }

    public void listarNinjas(){
        System.out.println("------------------------------------------------------------------------");
        for (Ninja n : cadastroNinjas){
            System.out.println(n.toString());
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void buscarNinjaPorNome(String nome){
        boolean nomeEncontrado = false;
        System.out.println("Informações do Ninja " + nome);
        System.out.println("------------------------------------");
        for (Ninja n : cadastroNinjas){
            if (n.getNome().toLowerCase().contains(nome.toLowerCase())){
                System.out.println(n);
                System.out.println("------------------------------------");
                nomeEncontrado = true;
            }
        }
        if (!nomeEncontrado){
            System.out.println("Ninja não encontrado. Tente novamente");
        }
    }

    public void buscarNinjaPorIdade(int idade){
        boolean idadeEncontrado = false;
        System.out.println("Informações do Ninja " + idade);
        for (Ninja n : cadastroNinjas){
            if (n.getIdade() == idade){
                System.out.println("-------------------------------------");
                System.out.println(n);
                System.out.println("-------------------------------------");
                idadeEncontrado = true;
            }
        }
        if (!idadeEncontrado){
            System.out.println("Ninja não encontrado. Tente novamente");
        }
    }

    public void buscarNinjaPorAldeia(String aldeia){
        boolean aldeiaEncontrado = false;
        System.out.println("Informações dos Ninjas da aldeia: " + aldeia);
        System.out.println("--------------------------------------");
        for (Ninja n : cadastroNinjas){
            if (n.getAldeia().toLowerCase().contains(aldeia.toLowerCase())){
                System.out.println(n);
                System.out.println("--------------------------------------");
                aldeiaEncontrado = true;
            }
        }
        if (!aldeiaEncontrado){
            System.out.println("Ninja não encontrado. Tente novamente");
        }
    }

    public void cadastroNinjasIniciais(){
        cadastroNinjas.add(new Ninja("Naruto Uzumaki", 16, "Aldeia da Folha"));
        cadastroNinjas.add(new Ninja("Sasuke Uchiha", 17, "Aldeia da Folha"));
        cadastroNinjas.add(new Ninja("Sakura Haruno", 17, "Aldeia da Folha"));
        cadastroNinjas.add(new Ninja("Kakashi Hatake", 30, "Aldeia da Folha"));
        cadastroNinjas.add(new Ninja("Gaara", 17, "Aldeia da Areia"));
        cadastroNinjas.add(new Ninja("Killer Bee", 15, "Aldeia da Nuvem"));
        cadastroNinjas.add(new Ninja("Itachi Uchiha", 21, "Aldeia da Folha"));
    }

    public void ordenarNinjasPorNome(){
        cadastroNinjas.sort(Comparator.comparing(Ninja::getNome));
    }


    public void ordenarNinjasPorIdade(){
        cadastroNinjas.sort(Comparator.comparing(Ninja::getIdade));
    }

    public void ordenarNinjasPorAldeia(){
        cadastroNinjas.sort(Comparator.comparing(Ninja::getAldeia));
    }

    public void scannerBufferClear(Scanner scanner){
        scanner.nextLine();
    }
}
