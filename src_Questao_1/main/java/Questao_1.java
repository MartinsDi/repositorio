
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Questao_1 {
    public static void main(String[] args) {
        String s, num;
        

        s = JOptionPane.showInputDialog("Digite a quantidade de digitos: ");
        if (s.matches("[^0-9]")) {
            s = JOptionPane.showInputDialog("Não é um numero valido, redigite: ");
        }
        int arr[] = new int[Integer.parseInt(s)];
        JOptionPane.showMessageDialog(null, "A seguir digite os numeros um por vez");

        for (int i = 0; i < Integer.parseInt(s); i++) {
            num = JOptionPane.showInputDialog("Digite o numero: ");
            if (num.matches("[^0-9]")) {
                num = JOptionPane.showInputDialog("Não é um numero valido, redigite: ");
            }

            arr[i] = Integer.parseInt(num);

        }
        mediana(arr);

        
    }
    public static int mediana (int arr[]){
        int aux, pos;
        String vet = "Vetor[ ", num;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            num = Integer.toString(arr[i]);
            vet = vet + num + ",";
        }
        vet = vet + "]";


        if (arr.length % 2 == 0) {
            pos = arr.length / 2;
            aux = arr[pos - 1] + arr[pos];
            JOptionPane.showMessageDialog(null, vet + "\nA mediana é: " + aux / 2);
            return aux/2;
        } else {
            pos = (arr.length + 1) / 2;
            JOptionPane.showMessageDialog(null, vet + "\nA mediana é: " + arr[pos - 1]);
            return arr[pos - 1];
        }
        
    }
    
}
