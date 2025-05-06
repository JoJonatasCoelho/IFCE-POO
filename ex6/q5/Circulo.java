public class Circulo extends ObjetoGeometrico{
    public double raio;
    public double area;
    public double perimetro;

    public Circulo(double raio){
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea(){
        area = Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void calcularPerimetro(){
        perimetro = 2 * Math.PI * raio;
    }

    @Override
    public void mostrarDados(){
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}