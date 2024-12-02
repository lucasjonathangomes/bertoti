package AntiPattern;

public class Vaca extends Animal{
    private String nome;
    public Vaca(String nome){
        this.nome=nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Nutrição: " + super.getNutricao() + ", Espécie: " + super.getEspecie();
    }
}
