package br.com.triersistemas.patolino.exercicioum;

public class Farmaceutico extends Pessoafisica{

    private String ofertasDia;

    public Farmaceutico(String nome, String documento,String ofertaDia) {
        super(nome, documento);
        this.ofertasDia = ofertaDia;
    }

    public String getOfertasDia() {
        return ofertasDia;
    }
}
