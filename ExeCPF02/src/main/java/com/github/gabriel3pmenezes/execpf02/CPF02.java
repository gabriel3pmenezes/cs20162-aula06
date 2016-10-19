/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.execpf02;

/**
 * Implementação da validação de CPF.
 * <p>Algoritmo correspondente ao obtido da lista da aula 6,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class CPF02 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private CPF02() {
    }

    /**
     * Obtém a validade do CPF.
     * @param d O número do CPF. Valor menor que onze.
     *
     * @return Boolean representando a validade do CPF.
     *
     */
    public static boolean cpf02(final int d[]) {
        if (d.length > 11) {
            return false;
        }

        int c = 7;
        int p = d[8];
        int s = d[8];

        while (0 <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = (s % 11) % 10;
        int k = ((s - p + (9 * j)) % 11) % 10;

        return (j == d[9]) && (k == d[10]);
    }
}
