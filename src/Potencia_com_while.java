
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
public class Potencia_com_while {
    public static void main(String[] args){
        int numero, expoente, resultado = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero!"));
        System.out.println("Valor digitado: " + numero);
        
        resultado = numero;
        
        expoente = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a potencia!"));
        System.out.println("Valor digitado: " + expoente);
        
        for (int cont = 1; cont < expoente; cont ++){
            resultado = resultado * numero;            
        }
    System.out.println("Valor digitado: " + resultado);  
    JOptionPane.showMessageDialog(null, numero + " elevado a " + expoente + " = " + resultado);
    }    
}
