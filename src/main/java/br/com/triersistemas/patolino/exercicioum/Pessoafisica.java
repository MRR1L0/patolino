package br.com.triersistemas.patolino.exercicioum;

import java.util.SplittableRandom;

public class Pessoafisica extends Pessoa{
    private String documento;
    public Pessoafisica() {
        var rd = new SplittableRandom();
        for (int i = 0; i < 8; i++) {
            documento = documento + rd.nextInt(0,10)+"";
        }
    }

    @Override
    public String getDocumento() {
        return documento;
    }
}
