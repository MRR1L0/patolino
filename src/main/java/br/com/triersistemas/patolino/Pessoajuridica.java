package br.com.triersistemas.patolino;

import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoajuridica extends Pessoa{

    public Pessoajuridica() {
        super();
        var rd = new SplittableRandom();
        for (int i = 0; i < 11; i++) {
            documento += rd.nextInt(0,10);
        }
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    public abstract List<String> getProdutos();
}
