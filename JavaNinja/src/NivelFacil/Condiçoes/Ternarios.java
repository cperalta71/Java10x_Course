package NivelFacil.Condiçoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios são usados para reduzir o codigo
        * variavel = (condicao) ? valorSeVerdade : valorSeFalso;
        * */

        short numMissoes = 9;
        String nivel = (numMissoes >= 10) ? "Esse ninja esta com mais de dez missoes" : "Esse ninja esta com menos de dez missoes";
        System.out.println(nivel);
    }
}
