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
public class Questao_2Test {

    public Questao_2 n;

    public Questao_2Test() {
    }

    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of main method, of class Questao_2.
     */
    @Test
    public void testMain() {
    }

    @Test
    public void pares() {
        int vet[] = {1, 5, 3, 4, 2};
        assertEquals(3, n.pares(vet));

        int vet1[] = {6, 10, 4, 3, 8, 6};
        assertEquals(5, n.pares(vet1));

        int vet2[] = {6, 5, 7, 4, 12};
        assertEquals(2, n.pares(vet2));

        int vet3[] = {2, 5, 4, 4};
        assertEquals(2, n.pares(vet3));

    }
}
