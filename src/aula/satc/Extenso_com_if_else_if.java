package aula.satc;


import javax.swing.JOptionPane;

/**
 *
 * @author EDUTEC
 */
public class Extenso_com_if_else_if {
    public static void main (String[] args){
        
        int entrada;
        
        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero entre 1 e 10"));
        System.out.println("Valor digitado: " + entrada);
        
        if (entrada > 10 )
            System.out.println("Numero Invalido");
        else if (entrada == 9)
            System.out.println("nove");
        else if (entrada == 8)
            System.out.println("oito");
        else if (entrada == 7)
            System.out.println("sete");
        else if (entrada == 6)
            System.out.println("seis");
        else if (entrada == 5)
            System.out.println("cinco");
        else if (entrada == 4)
            System.out.println("quatro");
        else if (entrada == 3)
            System.out.println("tres");
        else if (entrada == 2)
            System.out.println("dois");
        else if (entrada == 1)
            System.out.println("um");
        else if (entrada == 0)
            System.out.println("zero");
        

    }   
}
