package AntiPattern;

public class Main {
    public static void main(String[] args) {
        PlataformaDeOferta plataformaDeOferta = new PlataformaDeOferta();

        CanaisDeDistribuicao rs = new CanaisDeDistribuicao("Redes sociais");
        CanaisDeDistribuicao radio = new CanaisDeDistribuicao("Rádio");
        CanaisDeDistribuicao televisao = new CanaisDeDistribuicao("Televisão");

        plataformaDeOferta.seguir(rs);
        plataformaDeOferta.seguir(radio);
        plataformaDeOferta.seguir(televisao);

        plataformaDeOferta.pararDeSeguir(radio);

        plataformaDeOferta.enviarOferta();
    }
}
