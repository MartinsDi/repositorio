
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class Questao_2 {

    public static void main(String[] args) {

        String vet = "Vetor[ ", num;

        String s = JOptionPane.showInputDialog("Digite a quantidade de digitos: ");
        if (s.matches("[^0-9]")) {
            s = JOptionPane.showInputDialog("Não é um numero valido, redigite: ");
        }
        int n[] = new int[Integer.parseInt(s)];
        JOptionPane.showMessageDialog(null, "A seguir digite os numeros um por vez");

        for (int i = 0; i < Integer.parseInt(s); i++) {
            num = JOptionPane.showInputDialog("Digite o numero: ");
            if (num.matches("[^0-9]")) {
                num = JOptionPane.showInputDialog("Não é um numero valido, redigite: ");
            }
            vet = vet + num + ",";
            n[i] = Integer.parseInt(num);

        }
        vet = vet + "]";
        pares(n);

    }

    public static int pares(int n[]) {

        int count = 0;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + 2 == n[j] || n[i] - 2 == n[j]) {
                    count++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de pares: " + count);
        return count;

    }
}
