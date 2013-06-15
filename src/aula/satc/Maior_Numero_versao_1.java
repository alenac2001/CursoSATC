package aula.satc;


import javax.swing.JOptionPane;

public class Maior_Numero_versao_1 {
    public static void main(String[] args){
        
        int valores[] = new int[10];
        int maior = 0;
        
        for (int index = 0; index < 10 ; index ++) {
            valores[index] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor " + index + 1));
            
            if (valores[index] > maior)
                maior = valores[index];
        }      
        
        // Exibe o maior valor;
        JOptionPane.showMessageDialog(null, "Maior numero informado eh " + maior);
        
    }
    
}
