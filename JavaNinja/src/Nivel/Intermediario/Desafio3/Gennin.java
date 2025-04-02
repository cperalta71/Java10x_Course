package Nivel.Intermediario.Desafio3;

public class Gennin extends Jounin implements Ninja{

    public Gennin() {
    }

    public Gennin(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + ", sou um Gennin!");
        System.out.println("Minha habilidade é " + habilidade);

    }
}
