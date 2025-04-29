package ex5;
import java.util.ArrayList;

class EstacaoFerroviaria{
    public EstacaoFerroviaria(LinhaFerroviaria linhasFerroviarias){
        this.linhasFerroviarias = linhasFerroviarias;
    }

    public EstacaoFerroviaria(String sigla, String descricao, LinhaFerroviaria linhasFerroviarias,ArrayList<Trem> trens, ArrayList<Vagao> vagoes, ArrayList<Locomotiva> locomotivas){
        this.linhasFerroviarias = linhasFerroviarias;
        this.linhasFerroviarias.trens = trens != null ? trens : new ArrayList<>();
        this.linhasFerroviarias.vagoes = vagoes != null ? vagoes : new ArrayList<>();
        this.linhasFerroviarias.locomotivas = locomotivas != null ? locomotivas : new ArrayList<>();
    }

    public String sigla;
    public String descricao;
    public LinhaFerroviaria linhasFerroviarias;

}