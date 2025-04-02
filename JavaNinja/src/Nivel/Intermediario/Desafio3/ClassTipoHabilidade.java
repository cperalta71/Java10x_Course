package Nivel.Intermediario.Desafio3;

public class ClassTipoHabilidade {
    TipoHabilidade hability;

    public void ClassTipoHabilidade(String hability) {
        this.hability = TipoHabilidade.valueOf(hability);

    }
}
