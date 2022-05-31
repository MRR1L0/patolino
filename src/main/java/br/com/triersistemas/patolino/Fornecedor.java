package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoajuridica{
    private List<String> produtos;

    public Fornecedor() {
        super();
        produtos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Produto produto = new Produto();
            produtos.add(produto.getNomeProduto());
        }
    }

    @Override
    public List<String> getProdutos() {
        return produtos;
    }
}
