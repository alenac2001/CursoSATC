package aula.satc;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe sue nome!");
        int cont = 1;
        String Resultado = "";
        
        while (cont <= 10){
            Resultado += cont + " - " + nome + "\n";
            System.out.println(cont + " - " + nome );
            cont++;
        } 
        
        JOptionPane.showMessageDialog(null, Resultado);
            
     }
    
}
