public class Retangulo extends ObjetoGeometrico{
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea(){
        area = base * altura;
    }

    @Override
    public void calcularPerimetro(){
        perimetro = 2 * (base + altura);
    }

    @Override
    public void mostrarDados(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}