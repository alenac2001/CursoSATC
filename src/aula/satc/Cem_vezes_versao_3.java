package aula.satc;

import javax.swing.JOptionPane;

public class Cem_vezes_versao_3 {
        public static void main (String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe sue nome!");
        int cont = 1;
        
        while (cont <= 100){
            System.out.println(cont + " - " + nome );
            cont++;
        }            
     }
}
