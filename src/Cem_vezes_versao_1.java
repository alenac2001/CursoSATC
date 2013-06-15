
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
public class Cem_vezes_versao_1 {
    public static void main (String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe sue nome!");
        for ( int cont = 0; cont < 100; cont ++){
            System.out.println(cont + 1 + " - " + nome );
            
        }
    }
    
}
