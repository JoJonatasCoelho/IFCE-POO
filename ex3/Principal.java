import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Principal {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse("01/01/2023");
            Funcionario funcionario = new Funcionario("João", data, 3000.00f);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
