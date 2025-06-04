class Balao extends TransporteAereo {
    private int pesoLargada;

    @Override
    public void subir(int metros) {
        altitudeActual += metros;
    }

    @Override
    public void descer(int metros) {
        altitudeActual -= metros;
    }

    public void largarPeso(float peso) {
        System.out.println("Balão largou " + peso + " kg.");
    }

    public void aquecerAr(float temp) {
        System.out.println("Ar aquecido em " + temp + " graus.");
    }
}