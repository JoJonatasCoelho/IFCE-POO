class Main{
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        aviao.ligarMotor();
        aviao.abastecer(500);

        carro.ligarMotor();
        carro.abastecer(40);

        aviao.curvar(30);
        carro.curvar(45);
        bicicleta.curvar(60);
    }
}
