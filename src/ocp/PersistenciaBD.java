package ocp;

public class PersistenciaBD implements Persistencia{
    @Override
    public void persistir(Fatura fatura) {
        System.out.println("Simulando salvamento no bd...");
    }
}
