package br.com.triersistemas.patolino;

public class Farmaceutico extends Pessoafisica{

    private Produto ofertaDia;

    public Farmaceutico() {
        super();
       Produto produto = new Produto();
       ofertaDia = produto;
    }

    public Produto getOfertaDia() {
        return ofertaDia;
    }

}
