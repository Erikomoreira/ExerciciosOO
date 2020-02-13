package exercicio05;

public class Exercicio05 {

    public static void main(String[] args) {

        Caneta c = new Caneta("plástico","tinta");
        Lapis l = new Lapis("madeira", "grafite");
        PenaMosquito p = new PenaMosquito("metal", "nanquim");

        c.escrever();
        l.escrever();
        p.escrever();
    }

}
