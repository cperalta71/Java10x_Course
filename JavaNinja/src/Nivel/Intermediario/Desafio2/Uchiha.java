package Nivel.Intermediario.Desafio2;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "Sharingan";

    public void mostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        mostrarHabilidadeEspecial();
    }
}
