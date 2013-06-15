
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
public class Cem_vezes_versao_2 {
    public static void main (String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe sue nome!");
        int cont = 1;
        
        do{
            System.out.println(cont + " - " + nome );
            cont++;
        }while (cont < 101);           
            
     }
}

