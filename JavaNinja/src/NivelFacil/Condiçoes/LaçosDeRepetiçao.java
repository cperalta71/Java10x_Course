package NivelFacil.Condiçoes;

public class LaçosDeRepetiçao {
    public static void main(String[] args) {
        /*
        * Laços de Repeetição: Repetir ate que uma condiçao seja cumprida (do-while)
        * Ou ate um numero de condicoes seja cumprida (for)
        * */
        int numClones = 1;
        int numMaxClones = 40;

        /*while (numClones <= numMaxClones) {
            System.out.println("Naruto fez " + numClones + " clone das sombras");
            numClones++;
        }
*/
        for (int i = 0; i <= numMaxClones ; i++) {
            System.out.println("Naruto esta se clonando " + i + " vezes");

        }
    }
}
