package Pattern;

public class CanaisDeDistribuicao implements Observer{
    private String nome;

    public CanaisDeDistribuicao(String nome){
        this.nome = nome;
    }

    @Override
    public void update() {
        System.out.println(this.nome + " ESTÁ ATUALIZADO!");
    }
}
