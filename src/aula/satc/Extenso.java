package aula.satc;

import javax.swing.JOptionPane;

public class Extenso {
    public static void main(String[] args){
        int entrada;
        
        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero entre 1 e 10"));
        System.out.println("Valor digitado: " + entrada);
        
        if (entrada > 10 ){
            System.out.println("Numero Invalido");
        }else{
            switch (entrada){
                case 1: 
                    System.out.println("um");
                    break;
                case 2: 
                    System.out.println("dois");
                    break;
                case 3: 
                    System.out.println("tres");
                    break;
                case 4: 
                    System.out.println("quatro");
                    break;
                case 5: 
                    System.out.println("cinco");
                    break;
                case 6: 
                    System.out.println("seis");
                    break;
                case 7: 
                    System.out.println("sete");
                    break;
                case 8: 
                    System.out.println("oito");
                    break;
                case 9: 
                    System.out.println("nove");
                    break;
                default: 
                    System.out.println("zero");
            }
        }
        
    }
    
}
