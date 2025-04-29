package ex5;
import java.util.Date;
import java.util.ArrayList;

class Trem{
    public Trem(ArrayList<Vagao> vagoes, Locomotiva locomotiva, EstacaoFerroviaria origem, EstacaoFerroviaria destino, Date dataFormacao, String prefixo){
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao != null ? dataFormacao : new Date();
        this.vagoes = vagoes != null ? vagoes : new ArrayList<>();
        this.locomotiva = locomotiva != null ? locomotiva : new Locomotiva();
        this.origem = origem;
        this.destino = destino;
    }

    public String prefixo;
    public Date dataFormacao;
    public ArrayList<Vagao> vagoes;
    public Locomotiva locomotiva;
    public EstacaoFerroviaria origem;
    public EstacaoFerroviaria destino;
}
