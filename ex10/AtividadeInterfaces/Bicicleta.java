
class Bicicleta extends TransporteTerrestre implements Conduzivel {
    private int numeroRaios;

    @Override
    public void estacionar() {
        System.out.println("Bicicleta estacionada.");
    }

    @Override
    public void curvar(float angulo) {
        System.out.println("Bicicleta curvou " + angulo + " graus.");
    }

    public void pedalar() {
        System.out.println("Bicicleta pedalando.");
    }
}