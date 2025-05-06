public class Sub extends Mega{
    public static void main(String[] args){
        Sub sub = new Sub();
        sub.metodo1();
        sub.metodoSobrecarregado();
        sub.metodoSobrecarregado(5);
    }
    @Override
    public void metodo1(){
        System.out.println("Método 1 da classe Sub, um método que vêm da classe Mega e é mudado na classe Sub");
    }
    public void metodoSobrecarregado(){
        System.out.println("Método sobrecarregado da classe Sub");
    }

    public void metodoSobrecarregado(int i){
        System.out.println("Método sobrecarregado II da classe Sub, uma variação do método sobrecarregado");
    }
    
}