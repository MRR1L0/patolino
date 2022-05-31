package br.com.triersistemas.patolino.exercicioum;

public class Fornecedor extends Pessoajuridica{
    private String Produtos;

    public Fornecedor(String nome, String documento, String produtos) {
        super(nome, documento);
        Produtos = produtos;
    }

    public String getProdutos() {
        return Produtos;
    }
}
