/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author liandralopes
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá mundo");
        int num, total, par=0, impar=0, maior=0, media=0;
        total = 0;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: [valor 0 interrompe]"));
            if(num==0)
                break;
            total++;
            if(num%2==0)
                par++;
            else
                impar++;
            if(num>100)
                maior++;
            media += num;
        } while (num!=0);
        media = media/total;
        JOptionPane.showMessageDialog(null, "Resultado\n Total de Valores: " + total
                                        + "\nTotal de Pares: " + par
                                        + "\nTotal de Ímpares: " + impar
                                        + "\nAcima de 100: " + maior
                                        + "\n Média dos Valores: " + media);
    }
    
}
