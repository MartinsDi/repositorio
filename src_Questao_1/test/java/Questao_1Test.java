/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diego
 */
public class Questao_1Test {
    public Questao_1 n;
    
    public Questao_1Test() {
    }
    
    @BeforeEach
    public void setUp() {
        n = new Questao_1();
    }

    /**
     * Test of main method, of class Questao_1.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of mediana method, of class Questao_1.
     */
    @Test
    public void testMediana() {
        int vet []= {1, 5, 3, 4, 2};
        assertEquals(3,n.mediana(vet));
        
        int vet1 []= {6, 10, 4, 3, 8, 6};
        assertEquals(6,n.mediana(vet1));
        
        int vet2 []= {6, 5, 7, 4, 12};
        assertEquals(6,n.mediana(vet2));
        
        int vet3 []= {2, 5, 4, 4};
        assertEquals(4,n.mediana(vet3));
        
        
    }
    
}
