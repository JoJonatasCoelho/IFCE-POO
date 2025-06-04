class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
    private int numeroCilindrada;

    @Override
    public void estacionar() {
        System.out.println("Carro estacionado.");
    }

    @Override
    public void curvar(float angulo) {
        System.out.println("Carro curvou " + angulo + " graus.");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Carro abastecido com " + numLitros + " litros.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }

    public void embraiar() {
        System.out.println("Carro embraiado.");
    }
}