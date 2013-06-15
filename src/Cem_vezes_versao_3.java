
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
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
