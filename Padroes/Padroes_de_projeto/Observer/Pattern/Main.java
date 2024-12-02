package Pattern;

public class Main {
    public static void main(String[] args) {
        CanaisDeDistribuicao rs = new CanaisDeDistribuicao("Redes Sociais");
        CanaisDeDistribuicao panfleto = new CanaisDeDistribuicao("Panfleto");
        CanaisDeDistribuicao radio = new CanaisDeDistribuicao("radio");

        PlataformaDeOferta plataformaDeOferta = new PlataformaDeOferta();
        plataformaDeOferta.seguir(rs);
        plataformaDeOferta.seguir(panfleto);
        plataformaDeOferta.seguir(radio);

        plataformaDeOferta.pararDeSeguir(panfleto);

        plataformaDeOferta.enviarOferta();
    }
}
