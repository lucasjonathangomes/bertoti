package Pattern;

public class Fazenda {
    private String nome;

    public Fazenda(String nome){
        this.nome=nome;
    }

    public void nutrirAnimal(RotinaAnimal rotinaAnimal){
        rotinaAnimal.nutrir();
    }
}