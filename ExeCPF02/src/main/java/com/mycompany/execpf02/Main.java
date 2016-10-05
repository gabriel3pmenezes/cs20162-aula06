package com.mycompany.execpf02;

public class Main {

    public static boolean Cpf2(int d[]) {

        if(d.length > 11){
            return false;
        }
        
       int c = 7;
       int p = d[8];
       int s = d[8];
       
       while(0 <= c) {
           p = p + d[c];
           s = s + p;
           c = c - 1;
       }
       
       int j = (s % 11) % 10;
       int k = ((s - p + (9*j)) % 11) % 10;
       
       return j == d[9] && k == d[10];

    }

    public static void main(String[] args) {
        
        int a[] = new int[12];

        a[0] = 0;
        a[1] = 8;
        a[2] = 1;
        a[3] = 5;
        a[4] = 4;
        a[5] = 3;
        a[6] = 4;
        a[7] = 8;
        a[8] = 4;
        a[9] = 7;
        a[10] = 0;
        
        boolean resultado = Cpf2(a);
        
        System.out.println(resultado);

    }

}
 