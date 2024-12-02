package Pattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cesta cesta = new Cesta("Cesta", new BigDecimal(4));
        Biscoito biscoito = new Biscoito("Biscoito", new BigDecimal(26));
        Produto produto = new Produto("Produto", new BigDecimal(56.7));

        cesta.colocarDentroDaCesta(biscoito);
        cesta.colocarDentroDaCesta(produto);

        System.out.println(cesta);
    }
}
