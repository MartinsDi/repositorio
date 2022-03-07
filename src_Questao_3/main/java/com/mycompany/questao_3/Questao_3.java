/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Questao_3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Digite uma frase: ");
        
        crip(s);
    }
    public static String crip(String s){
        String ns = s.replace(" ", "");
        String out = "";
        int n;

        double num = Math.round(Math.sqrt(ns.length()));

        for (int i = 0; i < num; i++) {
            n = i;
            do {
                out = out + String.valueOf(ns.charAt(n));
                n = n + (int) num;

            } while (n < ns.length());
            out = out + " ";
        }
        JOptionPane.showMessageDialog(null,"A frase criptografada é: "+ out);
        return out;
    }
    
}
