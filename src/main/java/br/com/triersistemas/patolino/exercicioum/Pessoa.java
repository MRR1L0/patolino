package br.com.triersistemas.patolino.exercicioum;

import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoa {
    private String nome;


    public Pessoa() {
        var rd = new SplittableRandom();
        String[] listaNomes = {"Joao","Maria","Renan","Marcio","Matheus",
                "Murilo","Barbara","Thais","Joana","Roberto"};
        nome = listaNomes[rd.nextInt(0,listaNomes.length)];
    }

    public String getNome() {
        return nome;
    }

    public abstract String getDocumento();
}
