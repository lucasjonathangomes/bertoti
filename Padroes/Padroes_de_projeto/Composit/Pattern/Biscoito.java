package Pattern;

import java.math.BigDecimal;

public class Biscoito implements Component{

    private String nome;
    private BigDecimal preco;

    private Biscoito(){
        this.preco = BigDecimal.ZERO;
    }

    public Biscoito(String nome, BigDecimal precoDoBiscoito){
        this();
        this.nome=nome;
        this.preco=precoDoBiscoito;
    }

    @Override
    public BigDecimal preco() {
        return this.preco;
    }
    @Override
    public String toString() {
        return this.nome + ", Preço do biscoito: " + preco().toString();
    }
}