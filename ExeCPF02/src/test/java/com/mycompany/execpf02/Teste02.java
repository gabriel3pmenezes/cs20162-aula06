package com.mycompany.execpf02;

import static com.mycompany.execpf02.Main.Cpf2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel
 */
public class Teste02 {
    
    @org.junit.Test
    public void cpfInvalido01() {
        
        int a[] = new int[11];
        
        a[0] = 0;
        a[1] = 1;
        a[2] = 0;
        a[3] = 1;
        a[4] = 0;
        a[5] = 0;
        a[6] = 1;
        a[7] = 0;
        a[8] = 1;
        a[9] = 0;
        a[10] = 1;
        
        assertEquals(false, Cpf2(a));
        
    }
    
    @org.junit.Test
    public void cpfInvalido02() {
        
        int a[] = new int[11];
        
        a[0] = 0;
        a[1] = 5;
        a[2] = 1;
        a[3] = 8;
        a[4] = 4;
        a[5] = 3;
        a[6] = 4;
        a[7] = 3;
        a[8] = 4;
        a[9] = 3;
        a[10] = 1;
        
        assertEquals(false, Cpf2(a));
    }
    
    @org.junit.Test
    public void cpfInvalido03() {
        
        int a[] = new int[11];
        
        a[0] = 4;
        a[1] = 4;
        a[2] = 1;
        a[3] = 0;
        a[4] = 9;
        a[5] = 8;
        a[6] = 9;
        a[7] = 8;
        a[8] = 0;
        a[9] = 7;
        a[10] = 0;
        
        assertEquals(false, Cpf2(a));
    
    }
}
