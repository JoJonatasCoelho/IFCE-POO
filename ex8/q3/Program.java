class Program{
    public static void main(String[] args) {
        Classe cls = new Classe();
        System.out.println("Param antes era: " + cls.param);
        alteraParamDeEntrada(cls);
        System.out.println("agora Param é: " + cls.param);

    }

    public static void alteraParamDeEntrada(Classe entrada){
        System.out.println("alterado dentro da função para 1");
        entrada.param = 1;

    }
}
