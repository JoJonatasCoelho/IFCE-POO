package ex5;
import java.util.Date;
import java.util.ArrayList;

class Trem{
    public Trem(ArrayList<Vagao> vagoes, Locomotiva locomotiva, EstacaoFerroviaria origem, EstacaoFerroviaria destino, Date dataFormacao, String prefixo){
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao != null ? dataFormacao : new Date();
        if (vagoes != null) {
            this.vagoes = vagoes.size() <= 148 ? vagoes : new ArrayList<>();
            System.out.println("Limite de vagões atingido.");
        }
        else {
            this.vagoes = new ArrayList<>();
        }
        this.locomotiva = locomotiva != null ? locomotiva : new Locomotiva();
        this.origem = origem;
        this.destino = origem.igual(destino) ? null : destino;
    }

    public String prefixo;
    public Date dataFormacao;
    public ArrayList<Vagao> vagoes;
    public Locomotiva locomotiva;
    public EstacaoFerroviaria origem;
    public EstacaoFerroviaria destino;

    public void addVagao(Vagao vagao){
        if (vagoes.size() <= 148) {
            this.vagoes.add(vagao);
        }
        System.out.println("Limite de vagões atingido.");
        return;
    }
}
