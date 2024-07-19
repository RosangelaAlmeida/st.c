public class PessoaFisica {
    // Objetos da classe
    private String cpf;
    private String nome;
    private int idade;
    private String estadoCivil;

    //Atribuindo o Construtor da classe
    public PessoaFisica(String cpf, String nome, int idade, String estadoCivil) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    // Método para exibir as informações da pessoa

    public String toString() {
        return "CPF: " + this.cpf  + "\nNome: " + this.nome +
                "\nIdade: " + this.idade + "\nEstado Civil: " + this.estadoCivil;
    }

    // Método para testar a classe
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica("064.333.111-99", "Rosangela", 36, "Solteira");
        System.out.println(pessoa);
    }
}