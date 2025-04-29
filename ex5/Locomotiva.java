package ex5;
import java.util.ArrayList;

class Locomotiva{
    public Locomotiva(int numeroLocomotiva, int capacidadeTracao, int comprimento){
        this.numeroLocomotiva = numeroLocomotiva;
        this.capacidadeTracao = capacidadeTracao;
        this.comprimento = comprimento;
    }
    public Locomotiva(int numeroLocomotiva, int capacidadeTracao){
        this.numeroLocomotiva = numeroLocomotiva;
        this.capacidadeTracao = capacidadeTracao;
        this.comprimento = comprimento;
    }
    public Locomotiva(int numeroLocomotiva){
        this.numeroLocomotiva = numeroLocomotiva;
        this.capacidadeTracao = capacidadeTracao;
        this.comprimento = comprimento;
    }
    public Locomotiva(){
        this.numeroLocomotiva = 0;
        this.capacidadeTracao = 0;
        this.comprimento = 0;
    }
    
    public int numeroLocomotiva;
    public int capacidadeTracao;
    public int comprimento;
}