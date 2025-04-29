package ex5;
import java.util.ArrayList;

class LinhaFerroviaria{
    public LinhaFerroviaria(int numeroLinha, int extensao, String descricao, ArrayList<Trem> trens, ArrayList<Vagao> vagoes, ArrayList<Locomotiva> locomotivas){
        this.numeroLinha = numeroLinha;
        this.extensao = extensao;
        this.descricao = descricao;
        this.trens = trens != null ? trens : new ArrayList<>();
        this.vagoes = vagoes != null ? vagoes : new ArrayList<>();
        this.locomotivas = locomotivas != null ? locomotivas : new ArrayList<>();
    }

    public LinhaFerroviaria(){
        this.numeroLinha = 0;
        this.extensao = 0;
        this.descricao = "";
        this.trens = new ArrayList<>();
        this.vagoes = new ArrayList<>();
        this.locomotivas = new ArrayList<>();
    }

    public int numeroLinha;
    public int extensao;
    public String descricao;
    public ArrayList<Trem> trens;
    public ArrayList<Vagao> vagoes;
    public ArrayList<Locomotiva> locomotivas;

}