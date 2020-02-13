package exercicio04;

public class Funcionario extends Pessoa implements Imprimir {

    private int numeroMatricula;


    public Funcionario(String nome, int idade, String cidadeNascimento, int numeroMatricula) {

        super(nome, idade, cidadeNascimento);
        this.numeroMatricula = numeroMatricula;

    }

    public void exibirDados(){

        System.out.println("Nome:" + super.getNome());
        System.out.println("Idade:" + super.getIdade());
        System.out.println("Cidade:" + super.getCidadeNascimento());
        System.out.println("Número da Matrícula:" + this.numeroMatricula);

    }


}
