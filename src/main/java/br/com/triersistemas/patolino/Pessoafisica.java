package br.com.triersistemas.patolino.exercicioum;

import java.util.SplittableRandom;

public abstract class Pessoafisica extends Pessoa{
    public Pessoafisica() {
        super();
        var rd = new SplittableRandom();
        for (int i = 0; i < 8; i++) {
            documento += rd.nextInt(0,10);
        }
    }
    @Override
    public String getDocumento() {
        return documento;
    }
    public abstract Produto getOfertaDia();
}
