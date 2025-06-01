public class Excecoes {
    public static void processarNumero(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("Número negativo não permitido: " + numero);
        }
        System.out.println("Número processado: " + numero);
    }

    public static void main(String[] args) {
        try {
            processarNumero(-5);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        System.out.println("Execução continua normalmente...");
    }
}
