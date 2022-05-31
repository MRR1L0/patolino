package br.com.triersistemas.patolino.exercicioum;

import java.util.List;

public class Fornecedor extends Pessoajuridica{
    private List<Produto> produtos;

    public Fornecedor() {
        super();
        for (int i = 0; i < 4; i++) {
            Produto p = new Produto();
            produtos.add(p);
        }
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }
}
