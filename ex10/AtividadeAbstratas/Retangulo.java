public class Retangulo extends Poligono {
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String tipo() {
        return "Retângulo";
    }
}