package Pattern;

import java.math.BigDecimal;

public class Produto implements Component{
    private String nome;
    private BigDecimal preco;

    public Produto(){
        this.preco=BigDecimal.ZERO;
    }

    public Produto(String nome, BigDecimal preco){
        this();
        this.nome=nome;
        this.preco=preco;
    }

    @Override
    public BigDecimal preco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.nome + ", Preço do Produto: " + preco().toString();
    }
}
