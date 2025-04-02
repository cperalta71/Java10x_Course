package Nivel.Intermediario.Desafio3;

public class Jounin implements Ninja{
    String nome;
    int idade;
    String habilidade;
    private String especialidade;
    TipoHabilidade tipoHabilidade;

    public Jounin() {
    }

    public Jounin(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo: " + tipoHabilidade);
        System.out.println("Especialidade: " + especialidade);

    }

    @Override
    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + ", sou um Jounin!");
        System.out.println("Minha habilidade é " + habilidade + " e minha especialidade é " + getEspecialidade());
    }



}
