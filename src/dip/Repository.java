package dip;

import java.util.List;

public interface Repository<T> {
    //create
    public void create(T t);

    void create(Cliente t);

    //read
    public List<T> retrieve();

    //update
    public T update(T t);

    //delete
    public void delete(T t);

    Cliente update(Cliente t);

    void delete(Cliente t);
}
