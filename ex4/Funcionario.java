import java.util.Date;

public class Funcionario{

    public Funcionario(String nome, Date dataAdmissao, float salario){
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;

    }

    private static int counter = 0;
    private int id = ++counter;
    private String nome;
    private Date dataAdmissao;
    private float salario;

    public int getId(){
        return this.id;
    } 

    public String getNome(){
        return this.nome;
    }

    public boolean setNome(String nome){
        this.nome = nome;
        return true;
    }

    public Date getDataAdmissao(){
        return this.dataAdmissao;
    }

    public boolean setDataAdmissao(Date dataAdmissao) {
        if (dataAdmissao.after(new Date())) {
            return false;
        }
        this.dataAdmissao = dataAdmissao;
        return true;
    }

    public float getSalario() {
        return salario;
    }

    public boolean setSalario(float salario) {
        if (salario < 1100.00f) {
            return false;
        }
        this.salario = salario;
        return true;
    }
    
    public void tirarFerias(int dias) {
        System.out.println("O funcionario " + this.nome + " esta de ferias por " + dias + " dias.");
    }
    public void tirarFerias() {
        tirarFerias(30);
    }


}
