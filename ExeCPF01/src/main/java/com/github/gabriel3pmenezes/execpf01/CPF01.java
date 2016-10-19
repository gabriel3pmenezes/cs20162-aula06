/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.execpf01;

/**
 * Implementação da validação de CPF.
 * <p>Algoritmo correspondente ao obtido da lista da aula 6,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class CPF01 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private CPF01() {
    }

    /**
     * Obtém a validade do CPF.
     * @param d O número do CPF. Valor menor que onze.
     *
     * @return Boolean representando a validade do CPF.
     *
     */
    public static boolean cpf01(final int d[] ) {
        if (d.length > 11) {
            return false;
        }

        int sj = 0;
        int sk = 0;

        sj = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4])
             + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
        sk = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5])
             + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);

        int j = (sj % 11) % 10;
        int k = (sk % 11) % 10;

        return (j == d[9]) && (k == d[10]);
    }
}

