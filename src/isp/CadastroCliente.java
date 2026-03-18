package isp;

public class CadastroCliente implements Cadastravel, Verificavel{
    @Override
    public void salvarBD(){
        System.out.println("Produto Salvo");
    }
    @Override
    public void notificar(){
        System.out.println("Evento: produto novo");
    }

    @Override
    public void enviarSMS() {
        System.out.println("SMS Enviado");
    }
}
