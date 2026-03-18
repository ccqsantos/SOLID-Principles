package lsp;

public class Funcionario {
    private String nome;
    private Float salario;
    private LocalTrabalho local;

    public Funcionario(String nome, Float salario, LocalTrabalho local) {
        super();
        this.nome = nome;
        this.salario = salario;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public LocalTrabalho getLocal() {
        return local;
    }

    public void setLocal(LocalTrabalho local) {
        this.local = local;
    }
}
