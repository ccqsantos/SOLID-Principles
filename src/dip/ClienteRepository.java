package dip;

import java.util.List;

public class ClienteRepository implements Repository<Cliente>{
    @Override
    public void create(Cliente t) {

    }

    @Override
    public List<Cliente> retrieve() {
        return List.of();
    }

    @Override
    public Cliente update(Cliente t) {
        return null;
    }

    @Override
    public void delete(Cliente t) {

    }
}
