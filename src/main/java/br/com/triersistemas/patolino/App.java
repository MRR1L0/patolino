package br.com.triersistemas.patolino;

import java.util.Arrays;
import java.util.SplittableRandom;

public class App {

    public static void main(String[] args) {
        String documento = "";

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
        documento += resto;

        for (Char numero: documento.toCharArray()) {

        }


    }



}
