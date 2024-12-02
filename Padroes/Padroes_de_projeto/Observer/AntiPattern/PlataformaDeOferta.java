package AntiPattern;

public class PlataformaDeOferta extends OfertaComercial {
    public void notificar(CanaisDeDistribuicao canaisDeDistribuicao){
        canaisDeDistribuicao.update();
    };
    public void enviarOferta(){
        for(CanaisDeDistribuicao cd : canaisDeDistribuicaoList){
            notificar(cd);
        }
    };
}
