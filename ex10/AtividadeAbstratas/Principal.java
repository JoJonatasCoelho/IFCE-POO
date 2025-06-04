public class Principal {
    public static void main(String[] args) {
        Poligono[] poligonos = new Poligono[4];

        poligonos[0] = new Triangulo(10, 5);
        poligonos[1] = new Retangulo(8, 4);
        poligonos[2] = new Triangulo(6, 3);
        poligonos[3] = new Retangulo(5, 2);

        for (Poligono p : poligonos) {
            System.out.println("Tipo: " + p.tipo());
            p.imprimirDimensoes();
            System.out.println("Area: " + p.calcularArea());
            System.out.println("----------------------");
        }
    }
}
