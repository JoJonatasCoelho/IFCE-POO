public class Medico extends Pessoa{

    public Medico(String nome, String endereco, int idade, String cpf, boolean sexo, String crm, float salario, String especializacao){
        super(nome, endereco, idade, cpf, sexo);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
    }

    String crm;
    float salario;
    String especializacao;

    public void DarPlantao(){
        System.out.println("O médico " + this.nome + " está em plantao");
    }

    public void imprimirValores(){
        System.out.println("CRM: " + this.crm +
                           "\nSalario" + this.salario +
                           "\nEspecialização: " + this.especializacao);
    }

}
