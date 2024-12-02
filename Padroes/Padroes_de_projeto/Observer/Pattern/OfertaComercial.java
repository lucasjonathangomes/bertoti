package Pattern;

public interface OfertaComercial {
    public void seguir(Observer observer);
    public void pararDeSeguir(Observer observer);
    public void notificar(Observer observer);
    public void enviarOferta();
}
