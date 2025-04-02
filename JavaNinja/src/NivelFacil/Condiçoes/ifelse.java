package NivelFacil.Condiçoes;

public class ifelse {
    public static void main(String[] args) {
        /*
        * Objetivo = passar o ninja de nivel de acordo com as missoes
        * */

        String nome = "Naruto Uzumaki"; 
        String rank;
        int idade = 30;
        boolean hokage = false;
        short numMissoes = 30;
       

        if (numMissoes == 15 && idade > 18){
            System.out.println("Rank: Chuunin");

        } else if (numMissoes > 25 && idade > 20) {
            System.out.println("Rank: Jounin");

        } else {
            System.out.println("Rank: Gennin");
        }


    }
}
