public class Triangulo extends ObjetoGeometrico{
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea(){
        area = (base * altura) / 2;
    }

    @Override
    public void calcularPerimetro(){
        perimetro = base + 2 * Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
    }

    @Override
    public void mostrarDados(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}