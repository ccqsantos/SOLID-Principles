package srp;

public class Cliente {
    //Atributos
    private Integer id;
    private String nome;


    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Id: %d \tNome: %s \n", id, nome);
    }
}
