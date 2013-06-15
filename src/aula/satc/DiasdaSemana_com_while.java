package aula.satc;

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