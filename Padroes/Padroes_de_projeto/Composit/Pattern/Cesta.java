package Pattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cesta implements Component{
    private String nome;
    private BigDecimal precoDaCesta;
    private BigDecimal precoTotalDaCesta;
    private List<Component> components;

    public Caixa(){
        this.precoDaCesta = BigDecimal.ZERO;
        this.precoTotalDaCesta = BigDecimal.ZERO;
        this.components = new ArrayList<>();
    }

    public Caixa(String nome,BigDecimal precoDaCesta){
        this();
        this.nome=nome;
        this.precoDaCesta=precoDaCesta;
        colocarDentroDaCesta(this);
    }

    public void colocarDentroDaCesta(Component component){
        this.precoTotalDaCesta = this.precoTotalDaCesta.add(component.preco());
        this.components.add(component);
    }

    @Override
    public BigDecimal preco() {
        this.precoTotalDaCesta = this.precoTotalDaCesta.add(this.precoTotalDaCesta);
        return this.precoTotalDaCesta;
    }

    @Override
    public String toString() {
        return this.nome + ", Preço da cesta: " + this.precoDaCesta.toString() + ", Preço total da cesta: " + this.precoTotalDaCesta.toString();
    }
}

