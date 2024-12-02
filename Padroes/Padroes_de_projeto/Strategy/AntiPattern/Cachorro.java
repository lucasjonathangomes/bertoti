package AntiPattern;

public class Cachorro extends Animal{
    private String nome;
    public Cachorro(String nome){
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Nutrição: " + super.getNutricao() + ", Espécie: " + super.getEspecie();
    }
}
