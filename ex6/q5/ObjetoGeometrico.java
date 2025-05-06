import java.math.*;
public class ObjetoGeometrico{
	public ObjetoGeometrico(){

	}

    public void mostrarDados(){

    }

    public void calcularArea(){

    }

    public void calcularPerimetro(){

    }

    public static void main(String[] args) {
        Circulo cirulo = new Circulo(5);
        ObjetoGeometrico retangulo = new Retangulo(4, 5);
        ObjetoGeometrico triangulo = new Triangulo(3, 4);
        // ObjetoGeometrico cirulo = new Circulo();
        // ObjetoGeometrico retangulo = new Retangulo();
        // ObjetoGeometrico triangulo = new Triangulo();
        System.out.println("Dados do círculo:");
        cirulo.mostrarDados();
        System.out.println("Dados do retângulo:");
        retangulo.mostrarDados();
        System.out.println("Dados do triângulo:");
        triangulo.mostrarDados();
    }

}