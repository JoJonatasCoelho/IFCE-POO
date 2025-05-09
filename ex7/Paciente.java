public class Paciente extends Pessoa{
    public Paciente(String nome, String endereco, int idade, String cpf, boolean sexo, String doenca, String medicacao, boolean emAlta){
        super(nome, endereco, idade, cpf, sexo);
        this.doenca = doenca;
        this.medicacao = medicacao;
        this.emAlta = emAlta;
    }

    String doenca;
    String medicacao;
    boolean emAlta;

    public void SenteDor(){
        System.out.println("O paciente " + this.nome + " está sentindo dor");
    }

    public void EmAlta(){
        if(this.emAlta){
        System.out.println("O paciente " + this.nome + " está em alta");
        } else {
        System.out.println("O paciente " + this.nome + " não está em alta");
        }
    }

    public void imprimirValores(){
        super.imprimirValores();
        System.out.println("Doenças" + this.doenca +
                           "\nMedicação" + this.medicacao);
    }
}
