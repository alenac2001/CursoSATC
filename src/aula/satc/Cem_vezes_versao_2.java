package aula.satc;


import javax.swing.JOptionPane;

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

