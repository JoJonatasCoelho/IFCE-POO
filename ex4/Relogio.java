public class Relogio{
    void inicializar(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    void inicializar(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 1;
    }
    void inicializar(int hora){
        this.hora = hora;
        this.minuto = 1;
        this.segundo = 1;
    }

    public int hora;
    public int minuto;
    public int segundo;
}