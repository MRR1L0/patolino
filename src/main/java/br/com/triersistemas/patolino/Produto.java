package br.com.triersistemas.patolino;

import java.math.BigDecimal;
import java.util.SplittableRandom;
public class Produto {
    private String nomeProduto;
    private BigDecimal precoProduto;

    public Produto() {
        var rd = new SplittableRandom();
        String[] listaProdutos = {"Shampoo","Condicionador","RemedioX","RemedioY","Bala","Gel"};
        nomeProduto = listaProdutos[rd.nextInt(0,listaProdutos.length)];

        precoProduto = new BigDecimal(rd.nextInt(100,1000)).divide(new BigDecimal(100));
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public String toString() {
        return "Produto" +
                " Produto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ' ';
    }

}
