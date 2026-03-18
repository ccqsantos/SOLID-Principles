package ocp;

public class PersistenciaCSV implements Persistencia{

    @Override
    public void persistir(Fatura fatura) {
        System.out.println("Simulando salvamento como CSV");
    }
}
