package Pattern;

public class Main {
    public static void main(String[] args) {

        Animal vaca = new Animal("Vaca");
        vaca.setNutricao(Nutricao.CAPIM);

        Animal porco = new Animal("Porco");
        porco.setNutricao(Nutricao.LEGUME);

        Animal cachorro = new Animal("Cachorro");
        cachorro.setNutricao(Nutricao.CARNE);

        Fazenda faz = new Fazenda("Faz");
        faz.nutrirAnimal(vaca);
        faz.nutrirAnimal(porco);
        faz.nutrirAnimal(cachorro);
    }
}
