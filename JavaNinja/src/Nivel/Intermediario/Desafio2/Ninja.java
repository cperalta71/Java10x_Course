package Nivel.Intermediario.Desafio2;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    String statusMissao;
    String nivelDificuldade;

public Ninja(){}

    //Mostrar as informacoes dos ninjas
    public void mostrarInfo() {
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}
