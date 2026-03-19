package dip;

import java.util.List;

public class ClienteService{
    private ClienteRepository repo;

    public void adicionarCliente(Cliente c){
        repo.create(c);
    }

    public List<Cliente> localizarPorNome(Cliente c){
        return repo.retrieve();
    }
}
