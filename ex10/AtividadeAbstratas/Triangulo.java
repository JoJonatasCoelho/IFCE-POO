public class Triangulo extends Poligono {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String tipo() {
        return "Triângulo";
    }
}
