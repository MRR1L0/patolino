package br.com.triersistemas.patolino;

import java.util.SplittableRandom;

public abstract class Pessoafisica extends Pessoa{
    public Pessoafisica() {
        super();

    }
    @Override
    public String getDocumento() {
        return documento;
    }
    public abstract Produto getOfertaDia();

    private void gerarCPF(){
        int aux = 1;
        var rd = new SplittableRandom();
        int soma = 0;

        for (int i = 1; i < 10; i++) {
            int numero = rd.nextInt(0,10);
            documento += numero;
            aux = i * numero;
            soma = soma + aux;
        }

        int resto = soma % 11;

        System.out.println(resto);

    }
}
