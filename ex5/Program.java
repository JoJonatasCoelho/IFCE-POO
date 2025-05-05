package ex5;
import java.util.ArrayList;

class Program {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Criando instâncias de objetos
        LinhaFerroviaria linha = new LinhaFerroviaria(1, 100, "Linha 1", null, null, null);
        ArrayList<LinhaFerroviaria> linhas = new ArrayList<>();
        linhas.add(linha);
        Locomotiva locomotiva = new Locomotiva(1000, 200, 300);
        EstacaoFerroviaria estacao = new EstacaoFerroviaria("EST", "Estação 1", linhas, null, null, null);
        Trem trem = new Trem(null, locomotiva, estacao, estacao, null, "Trem 1");
        Vagao vagao = new Vagao(1, "Vagão 1", 100, 200, 300);
        // Adicionando vagões ao trem
        trem.vagoes.add(vagao);
        // Adicionando trens à linha ferroviária
        linha.trens.add(trem);
        // Adicionando vagões à linha ferroviária
        linha.vagoes.add(vagao);
        // Adicionando locomotivas à linha ferroviária
        linha.locomotivas.add(locomotiva);
        // Exibindo informações
        System.out.println("Linha: " + linha.numeroLinha);
        System.out.println("Descrição: " + linha.descricao);
        System.out.println("Trem: " + trem.prefixo);
        System.out.println("Vagão: " + vagao.tipo);
        System.out.println("Estação: " + estacao.sigla);
        System.out.println("Descrição da Estação: " + estacao.descricao);
        System.out.println("Número do Vagão: " + vagao.numeroVagao);
        System.out.println("Capacidade de Carga do Vagão: " + vagao.capacidadeCarga);
        System.out.println("Comprimento das Testeiras do Vagão: " + vagao.comprimentoTesteiras);
        System.out.println("Comprimento do Engate do Vagão: " + vagao.comprimentoEngate);
    }
}