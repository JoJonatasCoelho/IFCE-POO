abstract class Transporte { 
    protected String nome; 
    protected int numeroPassageiros; 
    protected int velocidadeActual;
    
    public boolean estaParado() {
        return velocidadeActual == 0;
    }
}