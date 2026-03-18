package ocp;

import java.util.Locale;

public class TesteOCP {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Fatura fatura = new Fatura();

        Persistencia persistencia = getPersistencia(args[0]);

        persistencia.persistir(fatura);


    }

    private static Persistencia getPersistencia(String tipo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Persistencia p = (Persistencia)Class.forName("ocp.Persistencia" + tipo.toUpperCase())
                .newInstance(); // nome completo da classe inclui o nome do pacote
        return (Persistencia) p;
    }
}
