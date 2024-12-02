package AntiPattern;

import java.util.ArrayList;
import java.util.List;

public class OfertaComercial {
    public List<CanaisDeDistribuicao> canaisDeDistribuicaoList = new ArrayList<>();

    public void seguir(CanaisDeDistribuicao canaisDeDistribuicao){
        this.canaisDeDistribuicaoList.add(canaisDeDistribuicao);
    };
    public void pararDeSeguir(CanaisDeDistribuicao canaisDeDistribuicao){
        this.canaisDeDistribuicaoList.remove(canaisDeDistribuicao);
    };
}
