public class TesteRelogio{
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio();
        Relogio relogio3 = new Relogio();
        relogio1.inicializar(1, 30, 13);
        relogio2.inicializar(1, 54);
        relogio3.inicializar(2);

        System.out.println("Relogio 1= " + relogio1.hora +":"+ relogio1.minuto+":" + relogio1.segundo);
        System.out.println("Relogio 2= " + relogio2.hora +":"+ relogio2.minuto+":" + relogio2.segundo);
        System.out.println("Relogio 3= " + relogio3.hora +":"+ relogio3.minuto+":" + relogio3.segundo);

    }
}