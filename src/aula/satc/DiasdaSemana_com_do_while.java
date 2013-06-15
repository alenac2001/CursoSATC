package aula.satc;

public class DiasdaSemana_com_do_while {
    public static void main(String[] args){
        String days[] = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
        
        int cont = 0;
        
        do{
            System.out.println(days[cont]);
            cont++;
           } while (cont < days.length);
        }      
} 
