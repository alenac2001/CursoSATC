
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
public class Media {
    public static void main(String[] args){

        float nota1,nota2, nota3, media;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 1:"));            
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 2:"));  
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota 3:")); 
        
        media = (nota1 + nota2 + nota3) / 3;
                
        if (media > 60){
            System.out.println("Media = " + media + " :-)");
        } else
            System.out.println("Media = " + media);
              
        
        
    }
 }
    