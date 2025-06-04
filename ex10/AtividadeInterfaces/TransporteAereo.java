abstract class TransporteAereo extends Transporte {
    protected int altitudeActual;
    public abstract void subir(int metros);
    public abstract void descer(int metros);

}