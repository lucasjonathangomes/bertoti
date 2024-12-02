package AntiPattern;

public class CanaisDeDistribuicao {
    private String nome;

    public CanaisDeDistribuicao(String nome){
        this.nome = nome;
    }
    public void update() {
        System.out.println(this.nome + " ESTÁ ATUALIZADO!");
    }
}
