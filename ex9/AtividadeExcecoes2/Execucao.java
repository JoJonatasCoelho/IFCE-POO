public class Execucao {
    public static void main(String[] args) {
        testarData(15, 8, 2023);    
        testarData(31, 2, 2023);    
        testarData(29, 2, 2024);    
        testarData(29, 2, 2023);    
        testarData(0, 5, 2023);     
        testarData(10, 13, 2023);  
        testarData(10, 0, 2023);    
        testarData(31, 4, 2023);    
        testarData(-1, 10, 2023);  
        testarData(10, 10, -2023); 
    }

    private static void testarData(int dia, int mes, int ano) {
        try {
            Data data = new Data(dia, mes, ano);
            System.out.println("Data criada com sucesso: " + data);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção ao criar Data(" + dia + ", " + mes + ", " + ano + "): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Outra exceção ao criar Data(" + dia + ", " + mes + ", " + ano + "): " + e.getMessage());
        }
    }
}