package lsp;

public class TesteLSP {
    public static void main(String[] args){
        Analista f1 = new Analista("Jão", 1000f, LocalTrabalho.SP);

        imprimir(f1);

        Vendedor f2 = new Vendedor("Henrique", 2000f);

        imprimir(f2);
    }

    public static void imprimir(Funcionario f){
        System.out.println("Nome: "+f.getNome());
        if(f.getLocal() == null){
            System.out.println("Sem Local de Trabalho");
        }else{
            System.out.println("Local de Trabalho: "+f.getLocal());
        }
        System.out.println("Salario: "+f.getSalario());
    }
}
