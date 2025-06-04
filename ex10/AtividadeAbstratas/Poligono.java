public abstract class Poligono {
    protected double base;
    protected double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double calcularArea();
    public abstract String tipo();

    public void imprimirDimensoes() {
        System.out.println("Base: " + base + ", Altura: " + altura);
    }
}