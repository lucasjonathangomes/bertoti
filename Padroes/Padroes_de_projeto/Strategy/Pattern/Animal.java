package Pattern;

public class Animal implements RotinaAnimal {
    private String nome;
    private Nutricao nutricao;

    public Animal(String nome){
        this.nome=nome;
    }

    @Override
    public void setNutricao(Nutricao nutriente) {
        this.nutricao=nutriente;
    }

    @Override
    public void nutrir() {
        StringBuilder string = new StringBuilder();
        string.append(this.nome).append(", INGERIU: ").append(this.nutricao.toString());
        System.out.println(string);
    }
    @Override
    public String toString() {
        return "NOME='" + this.nome + '\'' +
                ", NUTRIENTE=" + this.nutricao;
    }
}
