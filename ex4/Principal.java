import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Principal {
    public static void main(String[] args) {
        Date data = new Date();
        Date data2 = new Date();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data = sdf.parse("01/01/2023");
            data2 = sdf.parse("01/01/2026");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        Funcionario funcionario = new Funcionario("João", data, 3000.00f);

        System.out.println(funcionario.getNome());
        funcionario.tirarFerias(15);
        funcionario.tirarFerias();
        if(!funcionario.setSalario(1000)) 
            System.out.println("Salario inválido");
        if(!funcionario.setDataAdmissao(data2)) 
            System.out.println("Data de admissao inválida");
    }
}
