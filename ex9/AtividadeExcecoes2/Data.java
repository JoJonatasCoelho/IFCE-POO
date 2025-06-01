public class Data {
    public Data(int dia, int mes, int ano) throws DataException {
        if (mes < 1 || mes > 12) {
            throw new DataException("Mês inválido: ", mes);
        }
        if (dia < 1 || dia > 31) {
            throw new DataException("Dia inválido: ", dia);
        }
        if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    throw new DataException("Dia inválido para fevereiro em ano bissexto: ", dia);
                }
            } else {
                if (dia > 28) {
                    throw new DataException("Dia inválido para fevereiro em ano não bissexto: ", dia);
                }
            }
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            throw new DataException("Dia inválido para o mês: ", dia);
        }

        if (ano < 1) {
            throw new DataException("Ano inválido: ", ano);
        }


    }
}
