public class Pessoa{
    public Pessoa(String nome, String endereco, int idade, String cpf, boolean sexo){
        this.nome =nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    String nome;
    String endereco;
    int idade;
    String cpf;
    boolean sexo;

    public void Andar(){
        System.out.println(this.nome + " está andando");
    }

    public void imprimirValores(){
        System.out.println("Nome: " + this.nome +
                           "\nIdade" + this.idade +
                           "\nEndereco" + this.endereco +
                           "\nCPF" + this.cpf +
                           "Sexo" + ((sexo) ? "Masculino" : "Feminino"));
    }

}
