/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.questao_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diego
 */
public class Questao_3Test {
    public Questao_3 n;
    public Questao_3Test() {
    }
    
    @BeforeEach
    public void setUp() {
        n = new Questao_3();
    }

    @Test
    public void testSomeMethod() {
    }
    @Test
    public void testMain() {
    }

    @Test
    public void crip() {
        String s0 = "tenha um bom dia";
        assertEquals("taoa eum nmd hbi", n.crip(s0));
        
        String s1 = "ola mundo";
        assertEquals("omd luo an", n.crip(s1));
    }
}
