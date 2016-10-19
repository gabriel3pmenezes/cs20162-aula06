/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.execpf03;

/**
 * Implementação da validação de CPF.
 * <p>Algoritmo correspondente ao obtido da lista da aula 6,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class CPF03 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private CPF03() {
    }

    /**
     * Obtém a validade do CPF.
     * @param d O número do CPF. Valor menor que onze.
     *
     * @return Boolean representando a validade do CPF.
     *
     */
     public static boolean cpf03(final int d[]) {
     if (d.length > 11) {
            return false;
        }
        
       int c = 7;
       int p = d[8];
       int s = d[8];
       
       p = p + d[7];
       s = s + p;
       
       p = p + d[6];
       s = s + p;
       
       p = p + d[5];
       s = s + p;
       
       p = p + d[4];
       s = s + p;
       
       p = p + d[3];
       s = s + p;
       
       p = p + d[2];
       s = s + p;
       
       p = p + d[1];
       s = s + p;
       
       p = p + d[0];
       s = s + p;
       
       int j = (s % 11) % 10;
       int k = ((s - p + (9*j)) % 11) % 10;
       
       return j == d[9] && k == d[10];
    }
}
