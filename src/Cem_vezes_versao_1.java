
import javax.swing.JOptionPane;

public class Cem_vezes_versao_1 {
    public static void main (String[] args){
        
        String nome = JOptionPane.showInputDialog("Informe sue nome!");
        for ( int cont = 0; cont < 100; cont ++){
            System.out.println(cont + 1 + " - " + nome );
            
        }
    }
    
}
