package AntiPattern;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("CACHORRO");
        cachorro.setNutricao(Nutricao.CARNIVORO);
        cachorro.setEspecie(Especie.AGRESSIVO);

        Vaca vaca = new Vaca("VACA");
        vaca.setNutricao(Nutricao.HERBIVORO);
        vaca.setEspecie(Especie.MANSO);

        System.out.println(cachorro);
        System.out.println(vaca);
    }
}
