package ex5;
import java.util.ArrayList;

class EstacaoFerroviaria{
    public EstacaoFerroviaria(String sigla, String descricao, ArrayList<LinhaFerroviaria> linhasFerroviarias){
        this.sigla = sigla;
        this.descricao = descricao;
        this.linhasFerroviarias = linhasFerroviarias;
    }

    public EstacaoFerroviaria(String sigla, String descricao, ArrayList<LinhaFerroviaria> linhasFerroviarias,ArrayList<Trem> trens, ArrayList<Vagao> vagoes, ArrayList<Locomotiva> locomotivas){
        this.linhasFerroviarias = linhasFerroviarias;
        this.linhasFerroviarias.get(0).trens = trens != null ? trens : new ArrayList<>();
        this.linhasFerroviarias.get(0).vagoes = vagoes != null ? vagoes : new ArrayList<>();
        this.linhasFerroviarias.get(0).locomotivas = locomotivas != null ? locomotivas : new ArrayList<>();
    }

    public String sigla;
    public String descricao;
    public ArrayList<LinhaFerroviaria> linhasFerroviarias;

    public boolean igual(EstacaoFerroviaria estacao){
        int counter = this.sigla == estacao.sigla ? 1 : 0;
        counter = (this.descricao == estacao.descricao) ? 1 : 0;
        counter = (this.linhasFerroviarias == estacao.linhasFerroviarias) ? 1 : 0;
        return counter == 3;
    }
}