package ex5;
import java.util.ArrayList;

class Vagao{
    public Vagao(int numeroVagao, String tipo, int capacidadeCarga, int comprimentoTesteiras, int comprimentoEngate){
        this.numeroVagao = numeroVagao;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoTesteiras = comprimentoTesteiras;
        this.comprimentoEngate = comprimentoEngate;
    }
    public Vagao(int numeroVagao, String tipo, int capacidadeCarga, int comprimentoTesteiras){
        this.numeroVagao = numeroVagao;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.comprimentoTesteiras = comprimentoTesteiras;

    }

    public String tipo;
    public int capacidade;
    public int numeroVagao;
    public int capacidadeCarga;
    public int comprimentoTesteiras;
    public int comprimentoEngate;
}