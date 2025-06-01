import javax.swing.JOptionPane;

public class Cadastro{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de cadastro!");
        while(true){
            try {
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                String dddString = JOptionPane.showInputDialog("Digite seu DDD:");
                if (dddString.length() > 2 || dddString.length() < 2) {
                    throw new IllegalArgumentException("DDD deve possuir dois digitos.");
                }
                String telefoneString = JOptionPane.showInputDialog("Digite seu telefone:");
                if (telefoneString.length() > 9 || telefoneString.length() < 8) {
                    throw new IllegalArgumentException("Telefone deve possuir entre 8 e 9 digitos.");
                }
                int ddd = Integer.parseInt(dddString);
                int telefone = Integer.parseInt(telefoneString);
                if (ddd < 0 || telefone < 0) {
                    throw new IllegalArgumentException("DDD e telefone devem ser números positivos.");
                }
                if (nome == null || nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nome não pode ser vazio.");
                }
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\nNome: " + nome + "\nDDD: " + ddd + "\nTelefone: " + telefone);
                break; 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: DDD e telefone devem ser números inteiros.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }
}