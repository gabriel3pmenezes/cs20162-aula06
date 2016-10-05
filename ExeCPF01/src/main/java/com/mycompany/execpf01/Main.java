package com.mycompany.execpf01;

public class Main {

    public static boolean Cpf1(int d[]) {
        
        if(d.length > 11){
            return false;
        }
        
       int sj = 0;
       int sk = 0;
   
       sj = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4]) + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
       sk = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
        
       int j = (sj % 11) % 10;
       int k = (sk % 11) % 10;
       
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
        
        boolean resultado = Cpf1(a);
        
        System.out.println(resultado);

    }

}
