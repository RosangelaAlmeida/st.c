public class PessoaFisica {
    public String cpf = "064.333.111-99";
    public String nome = "Rosangela";
    public int idade = 36;
    public String estadoCivil = "Solteira";

    public static void main(String[] args) {

        PessoaFisica pessoa = new PessoaFisica();

        System.out.println("CPF: " + pessoa.cpf);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Estado Civil: " + pessoa.estadoCivil);
    }
}
