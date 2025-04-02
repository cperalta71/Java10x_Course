package Nivel.Intermediario.Desafio3;

public class Main {
    public static void main(String[] args) {

        //Definimos ninjas com cada tipo de habilidade.
        Jounin kakashi = new Jounin("Kakashi Hatake", 35, "Bola de Fogo", "Kamui", TipoHabilidade.KATON);
        Gennin naruto = new Gennin("Naruto Uzumaki", 17, "Kage Bunshin no Jutsu", TipoHabilidade.NINJUTSU);
        Gennin sarada = new Gennin("Sarada Uchiha", 14, "Bola de fogo", TipoHabilidade.KATON);
        Jounin sasuke = new Jounin("Sasuke Uchiha", 18, "Rinnegan", "Amaterasu", TipoHabilidade.RINNEGAN);
        Gennin lee = new Gennin("Rock Lee", 17, "Taijutsu", TipoHabilidade.TAIJUTSU);

        kakashi.getEspecialidade();
        kakashi.mostrarInfo();
        kakashi.executarHabilidades();

        System.out.println("----------------------------------");

        naruto.mostrarInfo();
        naruto.executarHabilidades();

        System.out.println("----------------------------------");
        sasuke.mostrarInfo();
        sasuke.executarHabilidades();

        System.out.println("----------------------------------");
        sarada.mostrarInfo();
        sarada.executarHabilidades();

        System.out.println("----------------------------------");
        lee.mostrarInfo();
        lee.executarHabilidades();
    }
}
