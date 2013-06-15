/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDUTEC
 */
public class DiasdaSemana_com_while {
    public static void main(String[] args){
        String days[] = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
        
        int cont = 0;
        
        while (cont < days.length ){
            System.out.println(days[cont]);
            cont++;
        }      
    }
    
}
