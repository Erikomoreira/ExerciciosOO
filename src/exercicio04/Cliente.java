package exercicio04;

public class Cliente extends Pessoa implements Imprimir {

    private String cpf;



    public Cliente(String nome, int idade, String cidadeNascimento, String cpf) {
        super(nome, idade, cidadeNascimento);
        this.cpf = cpf;
    }

    public void exibirDados(){

        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Cidade: " + super.getCidadeNascimento());
        System.out.println("CPF:" + this.cpf);

    }

}
