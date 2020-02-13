package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {

        Triangulo um = new Triangulo(2, 3);
        Triangulo dois = new Triangulo(1, 4);
        Triangulo tres = new Triangulo(3, 4);

        System.out.println(um.areaTriangulo());
        System.out.println(dois.areaTriangulo());
        System.out.println(tres.areaTriangulo());



    }
}
