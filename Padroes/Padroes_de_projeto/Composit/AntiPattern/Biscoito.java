package AntiPattern;

import java.math.BigDecimal;

public class Biscoito {
    private String nome;
    private BigDecimal preco = BigDecimal.ZERO;

    public Biscoito(String nome, BigDecimal preco){
        this.nome=nome;
        this.preco=preco;
    }
}
