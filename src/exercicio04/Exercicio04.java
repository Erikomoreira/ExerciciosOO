package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {

        Cliente c = new Cliente("Erik", 25,"São Paulo", "43113123232");
        Funcionario f = new Funcionario("Erik", 25,"São Paulo", 123456 );

        f.exibirDados();
        System.out.println("\n");
        c.exibirDados();

    }
}
