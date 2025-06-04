class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
    private int numeroMotores;

    @Override
    public void subir(int metros) {
        altitudeActual += metros;
    }

    @Override
    public void descer(int metros) {
        altitudeActual -= metros;
    }

    @Override
    public void curvar(float angulo) {
        System.out.println("Avião curvou " + angulo + " graus.");
    }

    @Override
    public void abastecer(int numLitros) {
        System.out.println("Avião abastecido com " + numLitros + " litros.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do avião ligado.");
    }
}